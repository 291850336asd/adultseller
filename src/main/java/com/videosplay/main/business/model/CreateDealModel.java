package com.videosplay.main.business.model;

import java.util.List;

/**
 * Created by sunmeng on 17/8/25.
 */
public class CreateDealModel {

    private String deviceId;
    private int userId;
    private int payType;
    private String transferCode;
    private List<GoodsShop> shops;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getTransferCode() {
        return transferCode;
    }

    public void setTransferCode(String transferCode) {
        this.transferCode = transferCode;
    }

    public List<GoodsShop> getShops() {
        return shops;
    }

    public void setShops(List<GoodsShop> shops) {
        this.shops = shops;
    }

    public boolean isNotEmpty(){
        return payType !=0 && transferCode!=null && !transferCode.isEmpty() && shops!=null && !shops.isEmpty();
    }
}
