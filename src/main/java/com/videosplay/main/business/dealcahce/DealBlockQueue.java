package com.videosplay.main.business.dealcahce;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by sunmeng on 17/8/28.
 */
public class DealBlockQueue {


    private static BlockingQueue<String> dealsQueue = new LinkedBlockingDeque<>();

    public static synchronized boolean add(String dealId){
        if(dealsQueue.contains(dealId)){
            return false;
        }
        dealsQueue.add(dealId);
        return true;
    }


    public static void removeDealId(String dealId){
        dealsQueue.remove(dealId);
    }






}
