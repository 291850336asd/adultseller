package com.videosplay.main.business.model;

/**
 * Created by sunmeng on 17/8/6.
 */
public class GoodsSort {
    private String sortName;
    private int sortType;
    private int sortParentType;
    private String sortEnName;
    private String sortDesc;
    private String sortImg;

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public int getSortType() {
        return sortType;
    }

    public void setSortType(int sortType) {
        this.sortType = sortType;
    }

    public int getSortParentType() {
        return sortParentType;
    }

    public void setSortParentType(int sortParentType) {
        this.sortParentType = sortParentType;
    }

    public String getSortEnName() {
        return sortEnName;
    }

    public void setSortEnName(String sortEnName) {
        this.sortEnName = sortEnName;
    }

    public String getSortDesc() {
        return sortDesc;
    }

    public void setSortDesc(String sortDesc) {
        this.sortDesc = sortDesc;
    }

    public String getSortImg() {
        return sortImg;
    }

    public void setSortImg(String sortImg) {
        this.sortImg = sortImg;
    }
}
