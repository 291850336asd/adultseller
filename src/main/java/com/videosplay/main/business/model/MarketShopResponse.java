package com.videosplay.main.business.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by sunmeng on 17/8/16.
 */
public class MarketShopResponse {

    private int selectCount;
    private BigDecimal totalMoney = new BigDecimal(0);
    private List<SelectMarketGoods> selectMarketGoodses;

    public int getSelectCount() {
        return selectCount;
    }

    public void setSelectCount(int selectCount) {
        this.selectCount = selectCount;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public List<SelectMarketGoods> getSelectMarketGoodses() {
        return selectMarketGoodses;
    }

    public void setSelectMarketGoodses(List<SelectMarketGoods> selectMarketGoodses) {
        this.selectMarketGoodses = selectMarketGoodses;
    }
}
