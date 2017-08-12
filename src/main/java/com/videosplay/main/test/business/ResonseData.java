package com.videosplay.main.test.business;

/**
 * Created by sunmeng on 17/7/5.
 */
public class ResonseData<T> {

    private int code;
    private String message;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "{" +
                "code:" + code +
                ", message:'" + message + '\'' +
                ", data:" + data +
                '}';
    }
}
