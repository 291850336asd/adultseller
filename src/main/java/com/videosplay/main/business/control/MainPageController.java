package com.videosplay.main.business.control;

import ch.qos.logback.core.joran.action.AppenderAction;
import com.videosplay.main.business.model.MainBanner;
import com.videosplay.main.business.model.MainResponse;
import com.videosplay.main.test.business.ResonseData;
import com.videosplay.main.business.model.GoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/api")
public class MainPageController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @PostMapping("/mainlist")
    public ResonseData<MainResponse> showMainPage(){

        ResonseData<MainResponse> resonseData = new ResonseData<MainResponse>();
        MainResponse mainResponse = new MainResponse();
        try {
            RowMapper<MainBanner> bannerRowMapper = new BeanPropertyRowMapper<MainBanner>(MainBanner.class);
            List<MainBanner> allInfos = jdbcTemplate.query("select * from banners", bannerRowMapper);
            if(allInfos == null || allInfos.size() == 0){
                allInfos = new ArrayList<>();
            }
            mainResponse.setBanners(allInfos);
            RowMapper<GoodsInfo> goods = new BeanPropertyRowMapper<GoodsInfo>(GoodsInfo.class);
            String queryStr = new String("select * from goods_info limit 0, 10");
            List<GoodsInfo> goodsInfos = jdbcTemplate.query(queryStr.toString(), goods);
            if(goodsInfos == null || goodsInfos.size() == 0){
                goodsInfos = new ArrayList<>();
            }
            mainResponse.setGoodsList(goodsInfos);
            resonseData.setData(mainResponse);
            resonseData.setCode(200);
            resonseData.setMessage("success");
        }catch (Exception e){
            resonseData.setData(null);
            resonseData.setCode(400);
            resonseData.setMessage("error");
        }
        return  resonseData;
    }
}