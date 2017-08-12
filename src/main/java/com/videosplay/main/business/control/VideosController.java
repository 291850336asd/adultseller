package com.videosplay.main.business.control;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.videosplay.main.business.model.GoodsInfo;
import com.videosplay.main.business.model.Video;
import com.videosplay.main.business.utils.StringUtils;
import com.videosplay.main.test.business.RequestData;
import com.videosplay.main.test.business.RequestPageData;
import com.videosplay.main.test.business.ResonseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/api")
public class VideosController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @CrossOrigin
    @PostMapping("/videosinfos")
    public List<GoodsInfo> getvideosInfos(){
        List<GoodsInfo> goodsInfos = new ArrayList<GoodsInfo>();
        RowMapper<GoodsInfo> personMapper = new BeanPropertyRowMapper<GoodsInfo>(GoodsInfo.class);
        List<GoodsInfo> info = jdbcTemplate.query("select * from videos", personMapper);
        return  info;
    }

    @CrossOrigin
    @PostMapping("/videosinfosPage")
    public ResonseData<List<Video>> getVideosInfosByPage(@RequestBody String request){
        ResonseData<List<Video>> resonseData = new ResonseData<List<Video>>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            RequestPageData requestData = (RequestPageData)objectMapper.readValue(request, RequestPageData.class);
            RowMapper<Video> personMapper = new BeanPropertyRowMapper<Video>(Video.class);
            StringBuilder queryStr = new StringBuilder("select * from videos");
            if(requestData != null){
                queryStr.append(StringUtils.getPageSizeQuery(requestData.getData().getPage(), requestData.getData().getPageSize()));
            }

            List<Video> info = jdbcTemplate.query(queryStr.toString(), personMapper);
            resonseData.setData(info);
            resonseData.setCode(200);
            resonseData.setMessage("success");
        }catch (IOException e){
            resonseData.setData(new ArrayList<>());
            resonseData.setCode(400);
            resonseData.setData(null);
        }
        return resonseData;
    }

    @CrossOrigin
    @PostMapping("/videoDetailInfo")
    public ResonseData<Video> getVideoDetailInfo(@RequestBody String request){
        ResonseData<Video>  resonseData = new ResonseData<>();
        try{
            println(request);
            ObjectMapper objectMapper = new ObjectMapper();
            RequestData<Video> requestData = (RequestData<Video>)objectMapper.readValue(request, new TypeReference<RequestData<Video>>(){});
            RowMapper<Video> personMapper = new BeanPropertyRowMapper<Video>(Video.class);
            String queryStr = "select * from videos where video_id = " + requestData.getData().getVideoId();
            Video info = jdbcTemplate.queryForObject(queryStr, personMapper);
            resonseData.setData(info);
            resonseData.setData(info);
            resonseData.setCode(200);
            resonseData.setMessage("success");
        }catch (Exception e){
            resonseData.setData(null);
            resonseData.setCode(400);
            resonseData.setMessage(e.getMessage());
        }
        return  resonseData;
    }


    @CrossOrigin
    @PostMapping("/videoplaycount")
    public void updateVideoPlayCount(@RequestBody String request){
        ResonseData<Video>  resonseData = new ResonseData<>();
        try{
            println(request);
            ObjectMapper objectMapper = new ObjectMapper();
            RequestData<Video> requestData = (RequestData<Video>)objectMapper.readValue(request, new TypeReference<RequestData<Video>>(){});
            String queryStr = "UPDATE videos SET play_count = play_count +1 where video_id = " + requestData.getData().getVideoId();
            jdbcTemplate.update(queryStr);
        }catch (Exception e){
        }
    }

    private void println(String str){
        System.out.println(str);
    }
}