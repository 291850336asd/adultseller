package com.videosplay.main.business.model;

/**
 * Created by sunmeng on 17/8/6.
 */
public class RequestPageBean<T> {
    private int page;
    private int pageSize = 20;

    private T data;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
