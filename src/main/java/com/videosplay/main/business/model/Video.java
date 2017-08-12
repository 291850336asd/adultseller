package com.videosplay.main.business.model;

/**
 * Created by sunmeng on 17/8/9.
 */
public class Video {
    private int videoId;
    private String videoTitle;
    private String videoImg;
    private int playCount;
    private String videoMp4Url;
    private String videoDescription;
    private String sourceFrom;
    private String videoKeywords;
    private String videoTags;
    private boolean isAds;
    private boolean hasVideo;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoImg() {
        return videoImg;
    }

    public void setVideoImg(String videoImg) {
        this.videoImg = videoImg;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public String getVideoMp4Url() {
        return videoMp4Url;
    }

    public void setVideoMp4Url(String videoMp4Url) {
        this.videoMp4Url = videoMp4Url;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public String getVideoKeywords() {
        return videoKeywords;
    }

    public void setVideoKeywords(String videoKeywords) {
        this.videoKeywords = videoKeywords;
    }

    public String getVideoTags() {
        return videoTags;
    }

    public void setVideoTags(String videoTags) {
        this.videoTags = videoTags;
    }

    public boolean isAds() {
        return isAds;
    }

    public void setAds(boolean ads) {
        isAds = ads;
    }

    public boolean isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }
}
