package com.videosplay.main.business.model;

import java.util.List;

/**
 * Created by sunmeng on 17/8/6.
 */
public class MainResponse {


    List<GoodsInfo> goodsList;
    List<MainBanner> banners;

    public List<GoodsInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsInfo> goodsList) {
        this.goodsList = goodsList;
    }

    public List<MainBanner> getBanners() {
        return banners;
    }

    public void setBanners(List<MainBanner> banners) {
        this.banners = banners;
    }
}
