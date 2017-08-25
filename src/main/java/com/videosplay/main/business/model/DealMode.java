package com.videosplay.main.business.model;

/**
 * Created by sunmeng on 17/8/25.
 */
public class DealMode {
    private int dealId;
    private int userId;
    private String device;
    private long dealTime;
    private int payType;
    private String transferCode;
    private DeliverState deliverState;
    private DealState dealState;

    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public long getDealTime() {
        return dealTime;
    }

    public void setDealTime(long dealTime) {
        this.dealTime = dealTime;
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

    public DeliverState getDeliverState() {
        return deliverState;
    }

    public void setDeliverState(DeliverState deliverState) {
        this.deliverState = deliverState;
    }

    public DealState getDealState() {
        return dealState;
    }

    public void setDealState(DealState dealState) {
        this.dealState = dealState;
    }
}
