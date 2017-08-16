package com.videosplay.main.business.model;

/**
 * Created by sunmeng on 17/8/16.
 */
public class GoodsShop extends GoodsId{
    private int count;
    private boolean isSelect;

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
