package com.videosplay.main.business.utils;

import com.videosplay.main.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sunmeng on 17/8/16.
 */
public class LogUtils {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void error(String err){
        log.error(err);
    }

    public static void warn(String str){
        log.warn(str);
    }

    public static void info(String str){
        log.info(str);
    }
}
