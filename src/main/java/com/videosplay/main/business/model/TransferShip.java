package com.videosplay.main.business.model;

/**
 * Created by sunmeng on 17/8/21.
 */
public class TransferShip {
    private int transferId;
    private String transferCode;
    private String transferName;

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public String getTransferCode() {
        return transferCode;
    }

    public void setTransferCode(String transferCode) {
        this.transferCode = transferCode;
    }

    public String getTransferName() {
        return transferName;
    }

    public void setTransferName(String transferName) {
        this.transferName = transferName;
    }
}