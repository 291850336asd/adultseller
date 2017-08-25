package com.videosplay.main.business.control;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.videosplay.main.business.model.*;
import com.videosplay.main.business.utils.LogUtils;
import com.videosplay.main.test.business.RequestData;
import com.videosplay.main.test.business.ResonseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunmeng on 17/8/16.
 */

@RestController
@RequestMapping(path="/api")
public class DealsController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @PostMapping("/createDeal")
    @Transactional
    public ResonseData createDeal(@RequestBody String request){
        ResonseData  resonseData = new ResonseData();
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            RequestData<CreateDealModel> requestData = (RequestData<CreateDealModel>)objectMapper.readValue(request, new TypeReference<RequestData<CreateDealModel>>(){});
            if(requestData != null && requestData.getData() != null){
                CreateDealModel createDealModel = requestData.getData();
                if(createDealModel.isNotEmpty()){
                    StringBuilder queryStr = new StringBuilder("insert into deals (user_id,device,pay_type,transfer_code) values (" +
                            createDealModel.getUserId() + ",'" +
                            createDealModel.getDeviceId() + "'," +
                            createDealModel.getPayType() + ",'" +
                            createDealModel.getTransferCode() + "')");
                    println(queryStr.toString());
                    KeyHolder keyHolder = new GeneratedKeyHolder();
                    jdbcTemplate.update(new PreparedStatementCreator(){
                                             @Override
                                             public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
                                                 return jdbcTemplate.getDataSource().getConnection().prepareStatement(queryStr.toString(), Statement.RETURN_GENERATED_KEYS);
                                             }
                                         },
                            keyHolder);
                    int dealId = keyHolder.getKey().intValue();
                    if(dealId > 0){
                        StringBuilder inserShop = new StringBuilder("insert into deals_shop (goods_id, goods_count,goods_price_id, deal_id) values ");
                        List<GoodsShop> goodsShops = createDealModel.getShops();
                        int length = goodsShops.size();
                        for(int i = 0; i < length; i++){
                            GoodsShop item = goodsShops.get(i);
                            if(i == length - 1){
                                inserShop.append("(" + item.getGoodsId() + "," + item.getCount() + "," + item.getGoodsPriceId() + "," + dealId + ")");
                            }else {
                                inserShop.append("(" + item.getGoodsId() + "," + item.getCount() + "," + item.getGoodsPriceId() + "," + dealId + "),");
                            }
                        }
                        println(inserShop.toString());
                        int i = jdbcTemplate.update(inserShop.toString());
                        println(String.valueOf(i));
                        resonseData.setCode(200);
                    }
                }
            }

            resonseData.setMessage("success");
        }catch (IOException e){
            resonseData.setMessage(e.getMessage());
        }
        return  resonseData;
    }


    private void println(String str){
        System.out.println(str);
    }
}
