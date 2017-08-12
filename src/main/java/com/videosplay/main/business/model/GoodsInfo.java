package com.videosplay.main.business.model;

import java.math.BigDecimal;

/**
 * Created by sunmeng on 17/8/5.
 */
public class GoodsInfo {
    private int goodsId;
    private String goodsName;
    private int goodsType;
    private BigDecimal goodsShopPrice;
    private BigDecimal goodsMarketPrice;
    private int goodNum;
    private int goodsSellCount;
    private String goodsDesc;
    private String goodsImg;
    private String promoteGift;

    public String getPromoteGift() {
        return promoteGift;
    }

    public void setPromoteGift(String promoteGift) {
        this.promoteGift = promoteGift;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getGoodsMarketPrice() {
        return goodsMarketPrice;
    }

    public void setGoodsMarketPrice(BigDecimal goodsMarketPrice) {
        this.goodsMarketPrice = goodsMarketPrice;
    }

    public int getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(int goodNum) {
        this.goodNum = goodNum;
    }

    public int getGoodsSellCount() {
        return goodsSellCount;
    }

    public void setGoodsSellCount(int goodsSellCount) {
        this.goodsSellCount = goodsSellCount;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(int goodsType) {
        this.goodsType = goodsType;
    }

    public BigDecimal getGoodsShopPrice() {
        return goodsShopPrice;
    }

    public void setGoodsShopPrice(BigDecimal goodsShopPrice) {
        this.goodsShopPrice = goodsShopPrice;
    }

}
