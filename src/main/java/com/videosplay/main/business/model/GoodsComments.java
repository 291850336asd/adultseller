package com.videosplay.main.business.model;

import java.sql.Timestamp;

/**
 * Created by sunmeng on 17/8/23.
 */
public class GoodsComments {
    private int commentsId;
    private int goodsId;
    private String userName;
    private Timestamp commentsTime;
    private String comentsDec;
    private EnumStr commentsStar;

    public int getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(int commentsId) {
        this.commentsId = commentsId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getCommentsTime() {
        return commentsTime;
    }

    public void setCommentsTime(Timestamp commentsTime) {
        this.commentsTime = commentsTime;
    }

    public String getComentsDec() {
        return comentsDec;
    }

    public void setComentsDec(String comentsDec) {
        this.comentsDec = comentsDec;
    }

    public EnumStr getCommentsStar() {
        return commentsStar;
    }

    public void setCommentsStar(EnumStr commentsStar) {
        this.commentsStar = commentsStar;
    }
}
