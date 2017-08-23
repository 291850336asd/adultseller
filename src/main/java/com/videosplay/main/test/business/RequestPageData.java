package com.videosplay.main.test.business;

/**
 * Created by sunmeng on 17/7/5.
 */
public class RequestPageData<T> {
    private int type;
    private String requestCode;
    private int pageSize = 10;
    private int page = 0;
    private T data;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(String requestCode) {
        this.requestCode = requestCode;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
