package com.videosplay.main.business.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sunmeng on 17/8/25.
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(cron = "0 0/5 * * * ?")
    public void showText(){
        System.out.println(dateFormat.format(new Date()) + "aaaaaaaaaaaaaa");
    }
}