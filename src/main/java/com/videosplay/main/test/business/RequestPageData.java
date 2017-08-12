package com.videosplay.main.test.business;

import com.videosplay.main.business.model.RequestPageBean;

/**
 * Created by sunmeng on 17/7/5.
 */
public class RequestPageData<T> {
    private int type;
    private String requestCode;
    private RequestPageBean<T> data;

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

    public RequestPageBean<T> getData() {
        return data;
    }

    public void setData(RequestPageBean<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequestData{" +
                "type=" + type +
                ", requestCode='" + requestCode + '\'' +
                ", data=" + data +
                '}';
    }
}
