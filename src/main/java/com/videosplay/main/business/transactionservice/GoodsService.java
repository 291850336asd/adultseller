package com.videosplay.main.business.transactionservice;

import com.videosplay.main.business.model.GoodsInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sunmeng on 17/8/10.
 */
@Component
public class GoodsService {

    private final JdbcTemplate jdbcTemplate;

    public GoodsService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    @Transactional
    public void updateGoodsInfo(GoodsInfo info) {

    }
}
