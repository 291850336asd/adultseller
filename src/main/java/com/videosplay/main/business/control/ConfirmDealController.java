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
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunmeng on 17/8/16.
 */

@RestController
@RequestMapping(path="/api")
public class ConfirmDealController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @PostMapping("/confirmDeal")
    @Transactional
    public ResonseData<ConfirmDealResponse> confirmDeal(@RequestBody String request){
        ResonseData<ConfirmDealResponse>  resonseData = new ResonseData<>();
        try{
            ConfirmDealResponse confirmDealResponse = new ConfirmDealResponse();
            ObjectMapper objectMapper = new ObjectMapper();
            RequestData<List<GoodsShop>> requestData = (RequestData<List<GoodsShop>>)objectMapper.readValue(request, new TypeReference<RequestData<List<GoodsShop>>>(){});
            if(requestData != null && requestData.getData()!=null && requestData.getData().size() > 0){
                MarketShopResponse marketShopResponse = new MarketShopResponse();
                StringBuilder ids = new StringBuilder();
                List<GoodsShop> goodShops = requestData.getData();
                for(GoodsShop goodsItem: goodShops){
                    if(goodsItem.getCount() > 0){
                        ids.append(goodsItem.getGoodsId() + ",");
                    }
                }

                String queryTransferStr = "select * from goods_transfer where transfer_id in (select transfer_id from goods_transfer_service where goods_id in ("  + ids.toString().substring(0, ids.length()-1)   +") group by transfer_id  having count(transfer_id) > " + (goodShops.size()-1) + ")";
                LogUtils.warn(queryTransferStr);
                RowMapper<TransferShip> transferMapper = new BeanPropertyRowMapper<TransferShip>(TransferShip.class);
                List<TransferShip> transferItem = jdbcTemplate.query(queryTransferStr, transferMapper);
                confirmDealResponse.setTransfers(transferItem);

                String queryStr = "select * from goods_info where goods_id in (" + ids.toString().substring(0, ids.length()-1) +  ")";
                LogUtils.warn(queryStr);
                RowMapper<GoodsInfo> personMapper = new BeanPropertyRowMapper<GoodsInfo>(GoodsInfo.class);
                List<GoodsInfo> info = jdbcTemplate.query(queryStr.toString(), personMapper);
                if(info != null && info.size() > 0){
                    for(GoodsShop goodsItem: goodShops){
                        GoodsInfo rawGoods = info.stream().filter(item-> (item.getGoodsId() == goodsItem.getGoodsId())).findFirst().get();
                        String queryPrice = "select * from goods_price where goods_id=" + rawGoods.getGoodsId();
                        RowMapper<GoodsPrice> priceMapper = new BeanPropertyRowMapper<GoodsPrice>(GoodsPrice.class);
                        List<GoodsPrice> prices = jdbcTemplate.query(queryPrice, priceMapper);
                        rawGoods.setPricesList(prices);
                        if(rawGoods != null){
                            SelectMarketGoods selectMarketGoods = new SelectMarketGoods();
                            if(rawGoods.getGoodsNum() >= goodsItem.getCount()){
                                if(marketShopResponse.getSelectMarketGoodses() == null){
                                    List<SelectMarketGoods> selectGoods = new ArrayList<>();
                                    marketShopResponse.setSelectMarketGoodses(selectGoods);
                                }
                                selectMarketGoods.setCount(goodsItem.getCount());
                                selectMarketGoods.setGoodsInfo(rawGoods);
                            }else{
                                selectMarketGoods.setCount(rawGoods.getGoodsNum());
                                selectMarketGoods.setGoodsInfo(rawGoods);
                            }
                            selectMarketGoods.setSelect(goodsItem.isSelect());
                            if(selectMarketGoods.isSelect()){
                                marketShopResponse.setSelectCount(marketShopResponse.getSelectCount() + selectMarketGoods.getCount());
                                marketShopResponse.setTotalMoney(marketShopResponse.getTotalMoney().add(selectMarketGoods.getGoodsInfo().getGoodsShopPrice().multiply(new BigDecimal(selectMarketGoods.getCount()))));
                            }
                            marketShopResponse.getSelectMarketGoodses().add(selectMarketGoods);
                        }
                    }
                }
                confirmDealResponse.setMarketShop(marketShopResponse);
                resonseData.setData(confirmDealResponse);
                resonseData.setMessage("success");
            }
        }catch (Exception e){
            resonseData.setData(null);
            resonseData.setMessage(e.getMessage());
        }
        return  resonseData;
    }


    private void println(String str){
        System.out.println(str);
    }
}
