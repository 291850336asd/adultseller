package com.videosplay.main.test.business;

/**
 * Created by sunmeng on 17/7/5.
 */
public class RequestData<T> {
    private int type;
    private String requestCode;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
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
