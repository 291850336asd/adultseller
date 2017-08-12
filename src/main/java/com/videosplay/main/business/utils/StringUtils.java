package com.videosplay.main.business.utils;

/**
 * Created by sunmeng on 17/8/9.
 */
public class StringUtils {


    public static String getPageSizeQuery(int page, int pageSize){
        StringBuilder builder = new StringBuilder(" limit ");
        builder.append( page * pageSize + " ," + pageSize + " ");
        return builder.toString();
    }
}
