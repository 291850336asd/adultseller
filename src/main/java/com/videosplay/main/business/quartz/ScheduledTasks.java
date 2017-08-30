package com.videosplay.main.business.quartz;

import com.videosplay.main.business.dealcahce.DealBlockQueue;
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

    private int second = 1000;
    private long minute = second * 60;
    private long halfHour = 30 * minute;
    private long hour = minute * 60;
    private long day = hour * 24;

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Scheduled(cron = "0 0/10 * * * ?")
    public void showText(){
        System.out.println("qqqqqqqqq");
        RowMapper<DealMode> dealMapper = new BeanPropertyRowMapper<DealMode>(DealMode.class);
        StringBuilder queryDeals = new StringBuilder("select * from deals where deal_state='NOTPAY' or deal_state='OVERDATE'");
        List<DealMode> allUnPayDeals = jdbcTemplate.query(queryDeals.toString(), dealMapper);
        for (DealMode item: allUnPayDeals) {
            checkAndUpdateDeals(item);
        }
    }

    @Transactional
    private void checkAndUpdateDeals(DealMode dealMode){
        try{
            if(DealBlockQueue.add(String.valueOf(dealMode.getDealId()))){
                long current = new Date().getTime();
                long betweenTime = current - dealMode.getDealTime().getTime();
                if(betweenTime > day){
                    jdbcTemplate.update("delete from deals where deal_id="+ dealMode.getDealId());
                    jdbcTemplate.update("delete from deals_shop where deal_id="+ dealMode.getDealId());
                }else if(betweenTime > halfHour){
                    jdbcTemplate.update("update deals set deal_state='OVERDATE' where deal_id="+ dealMode.getDealId());
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DealBlockQueue.removeDealId(String.valueOf(dealMode.getDealId()));
        }
    }
}