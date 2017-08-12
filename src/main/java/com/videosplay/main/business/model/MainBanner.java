package com.videosplay.main.business.model;

/**
 * Created by sunmeng on 17/8/6.
 */
public class MainBanner {

    private String bannerPicUrl;
    private String bannerChangeLink;
    private int bannerType;
    private String bannerPicDesc;

    public String getBannerPicUrl() {
        return bannerPicUrl;
    }

    public void setBannerPicUrl(String bannerPicUrl) {
        this.bannerPicUrl = bannerPicUrl;
    }

    public String getBannerChangeLink() {
        return bannerChangeLink;
    }

    public void setBannerChangeLink(String bannerChangeLink) {
        this.bannerChangeLink = bannerChangeLink;
    }

    public int getBannerType() {
        return bannerType;
    }

    public void setBannerType(int bannerType) {
        this.bannerType = bannerType;
    }

    public String getBannerPicDesc() {
        return bannerPicDesc;
    }

    public void setBannerPicDesc(String bannerPicDesc) {
        this.bannerPicDesc = bannerPicDesc;
    }
}
