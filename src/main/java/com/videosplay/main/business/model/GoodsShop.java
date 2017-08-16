package com.videosplay.main.business.model;

/**
 * Created by sunmeng on 17/8/16.
 */
public class GoodsShop extends GoodsId{
    private int count;
    private boolean select;

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
