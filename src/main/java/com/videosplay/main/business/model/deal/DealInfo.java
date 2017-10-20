package com.videosplay.main.business.model.deal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.videosplay.main.business.model.DealState;
import com.videosplay.main.business.model.DeliverState;

/**
 * Created by sunmeng on 17/10/19.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DealInfo {

    private String deal_time;
    private int payType;
    private DeliverState deliverState;
    private DealState dealState;

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
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

    public String getDeal_time() {
        return deal_time;
    }

    public void setDeal_time(String deal_time) {
        this.deal_time = deal_time;
    }
}
