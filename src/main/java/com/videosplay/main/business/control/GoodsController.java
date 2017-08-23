package com.videosplay.main.business.control;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.videosplay.main.business.model.*;
import com.videosplay.main.business.utils.LogUtils;
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
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path="/api")
public class GoodsController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @PostMapping("/goodsinfos")
    public List<GoodsInfo> getGoodsInfos(){
        List<GoodsInfo> goodsInfos = new ArrayList<GoodsInfo>();
        RowMapper<GoodsInfo> personMapper = new BeanPropertyRowMapper<GoodsInfo>(GoodsInfo.class);
        List<GoodsInfo> info = jdbcTemplate.query("select * from goods_info", personMapper);
        return  info;
    }

    @CrossOrigin
    @PostMapping("/goodsinfosPage")
    public ResonseData<List<GoodsInfo>> getGoodsInfosByPage(@RequestBody String request){

        ResonseData<List<GoodsInfo>> resonseData = new ResonseData<List<GoodsInfo>>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            RequestPageData requestData = (RequestPageData)objectMapper.readValue(request, RequestPageData.class);
            RowMapper<GoodsInfo> personMapper = new BeanPropertyRowMapper<GoodsInfo>(GoodsInfo.class);
            StringBuilder queryStr = new StringBuilder("select * from goods_info");
            if(requestData != null){
                queryStr.append(StringUtils.getPageSizeQuery(requestData.getPage(), requestData.getPageSize()));
            }
            List<GoodsInfo> info = jdbcTemplate.query(queryStr.toString(), personMapper);
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
    @PostMapping("/goodsinfosSort")
    public ResonseData<List<GoodsInfo>> getGoodsInfosBySort(@RequestBody String request){

        ResonseData<List<GoodsInfo>> resonseData = new ResonseData<List<GoodsInfo>>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            RequestPageData<SortRequest> requestData = (RequestPageData<SortRequest>)objectMapper.readValue(request, new TypeReference<RequestPageData<SortRequest>>(){});
            RowMapper<GoodsInfo> personMapper = new BeanPropertyRowMapper<GoodsInfo>(GoodsInfo.class);
            StringBuilder queryStr = new StringBuilder("select * from goods_info where ");
            if(requestData != null && requestData.getData() != null){
                if(requestData.getData().getItemType() == 0){
                    queryStr.append("goods_type in (select sort_type from goods_sort where sort_parent_type = " + requestData.getData().getParentType() + ")");
                }else{
                    queryStr.append("goods_type = " + requestData.getData().getItemType() + "");
                }
                queryStr.append(StringUtils.getPageSizeQuery(requestData.getPage(), requestData.getPageSize()));
            }
            println(queryStr.toString());
            List<GoodsInfo> info = jdbcTemplate.query(queryStr.toString(), personMapper);
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
    @PostMapping("/goodsDetailInfo")
    public ResonseData<GoodsInfo> getGoodsDetailInfo(@RequestBody String request){
        ResonseData<GoodsInfo>  resonseData = new ResonseData<>();
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            RequestData<GoodsInfo> requestData = (RequestData<GoodsInfo>)objectMapper.readValue(request, new TypeReference<RequestData<GoodsInfo>>(){});
            RowMapper<GoodsInfo> personMapper = new BeanPropertyRowMapper<GoodsInfo>(GoodsInfo.class);
            String queryStr = "select * from goods_info where goods_id = " + requestData.getData().getGoodsId();
            LogUtils.warn(queryStr);
            GoodsInfo info = jdbcTemplate.queryForObject(queryStr, personMapper);
            String queryPrice = "select * from goods_price where goods_id=" + requestData.getData().getGoodsId();
            RowMapper<GoodsPrice> priceMapper = new BeanPropertyRowMapper<GoodsPrice>(GoodsPrice.class);
            List<GoodsPrice> prices = jdbcTemplate.query(queryPrice, priceMapper);

            String quertComments = "select * from goods_comments where goods_id=" + requestData.getData().getGoodsId() + " limit 0,2";
            RowMapper<GoodsComments> commentsMapper = new BeanPropertyRowMapper<GoodsComments>(GoodsComments.class);
            List<GoodsComments> comments = jdbcTemplate.query(quertComments, commentsMapper);
            info.setPricesList(prices);
            info.setGoodsComments(comments);
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
    @PostMapping("/goodsComments")
    public ResonseData<List<GoodsComments>> getGoodsComments(@RequestBody String request){
        ResonseData<List<GoodsComments>>  resonseData = new ResonseData<>();
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            RequestData<GoodsInfo> requestData = (RequestData<GoodsInfo>)objectMapper.readValue(request, new TypeReference<RequestData<GoodsInfo>>(){});
            StringBuilder quertComments = new StringBuilder("select * from goods_comments where goods_id=" + requestData.getData().getGoodsId());
            quertComments.append(StringUtils.getPageSizeQuery(requestData.getPage(), requestData.getPageSize()));
            RowMapper<GoodsComments> commentsMapper = new BeanPropertyRowMapper<GoodsComments>(GoodsComments.class);
            List<GoodsComments> comments = jdbcTemplate.query(quertComments.toString(), commentsMapper);
            resonseData.setData(comments);
            resonseData.setCode(200);
            resonseData.setMessage("success");
        }catch (Exception e){
            resonseData.setData(null);
            resonseData.setCode(400);
            resonseData.setMessage(e.getMessage());
        }
        return  resonseData;
    }

    private void println(String str){
        System.out.println(str);
    }
}