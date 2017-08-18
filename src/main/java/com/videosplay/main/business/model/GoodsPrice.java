package com.videosplay.main.business.model;

import java.math.BigDecimal;

/**
 * Created by sunmeng on 17/8/18.
 */
public class GoodsPrice extends GoodsId{
    private int goodsPriceId;
    private String goodsColorStyleModel;
    private BigDecimal goodsPrice;

    public int getGoodsPriceId() {
        return goodsPriceId;
    }

    public void setGoodsPriceId(int goodsPriceId) {
        this.goodsPriceId = goodsPriceId;
    }

    public String getGoodsColorStyleModel() {
        return goodsColorStyleModel;
    }

    public void setGoodsColorStyleModel(String goodsColorStyleModel) {
        this.goodsColorStyleModel = goodsColorStyleModel;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
