package com.videosplay.main.business.quartz;

import com.videosplay.main.business.model.DealMode;
import com.videosplay.main.business.model.GoodsComments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by sunmeng on 17/8/25.
 */
@Component
public class ScheduledTasks {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Scheduled(cron = "0 0/5 * * * ?")
    public void showText(){
        RowMapper<DealMode> dealMapper = new BeanPropertyRowMapper<DealMode>(DealMode.class);
        StringBuilder queryDeals = new StringBuilder("select * from deals where deal_state=NOTPAY or deal_state=OVERDATE");
        List<DealMode> allUnPayDeals = jdbcTemplate.query(queryDeals.toString(), dealMapper);
        for (DealMode item: allUnPayDeals) {
            checkAndUpdateDeals(item);
        }
    }

    @Transactional
    private void checkAndUpdateDeals(DealMode dealMode){
        System.out.println(dealMode.getDealTime() + ":" + new Date().getTime());
    }
}