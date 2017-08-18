package com.videosplay.main.business.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by sunmeng on 17/8/5.
 */
public class GoodsInfo extends GoodsId{
    private String goodsName;
    private int goodsType;
    private BigDecimal goodsShopPrice;
    private BigDecimal goodsMarketPrice;
    private int goodsNum;
    private int goodsSellCount;
    private String goodsDesc;
    private String goodsImg;
    private String promoteGift;
    private String goodsCode;

    private List<GoodsPrice> pricesList;

    public List<GoodsPrice> getPricesList() {
        return pricesList;
    }

    public void setPricesList(List<GoodsPrice> pricesList) {
        this.pricesList = pricesList;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getPromoteGift() {
        return promoteGift;
    }

    public void setPromoteGift(String promoteGift) {
        this.promoteGift = promoteGift;
    }

    public BigDecimal getGoodsMarketPrice() {
        return goodsMarketPrice;
    }

    public void setGoodsMarketPrice(BigDecimal goodsMarketPrice) {
        this.goodsMarketPrice = goodsMarketPrice;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodNum) {
        this.goodsNum = goodNum;
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
