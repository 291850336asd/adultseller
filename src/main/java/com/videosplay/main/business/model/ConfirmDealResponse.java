package com.videosplay.main.business.model;

import java.util.List;

/**
 * Created by sunmeng on 17/8/21.
 */
public class ConfirmDealResponse {

    private MarketShopResponse marketShop;
    private List<TransferShip> transfers;

    public MarketShopResponse getMarketShop() {
        return marketShop;
    }

    public void setMarketShop(MarketShopResponse marketShop) {
        this.marketShop = marketShop;
    }

    public List<TransferShip> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<TransferShip> transfers) {
        this.transfers = transfers;
    }
}
