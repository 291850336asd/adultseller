package com.videosplay.main.business.model;

/**
 * Created by sunmeng on 17/8/16.
 */
public class SelectMarketGoods {
    private int count;
    private boolean isSelect;
    private GoodsInfo goodsInfo;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public GoodsInfo getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
    }
}
