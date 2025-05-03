package com.sbi.yono.Yono30.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RegisterMobile {

    @Id
    @Column
    private String refId;

    @Column
    private String mblNo;

    @Column
    private String device;

    @Column
    private String platform;

    // ✅ No-args constructor
    public RegisterMobile() {
    }

    // ✅ All-args constructor
    public RegisterMobile(String refId, String mblNo, String device, String platform) {
        this.refId = refId;
        this.mblNo = mblNo;
        this.device = device;
        this.platform = platform;
    }

    // ✅ Getters
    public String getRefId() {
        return refId;
    }

    public String getMblNo() {
        return mblNo;
    }

    public String getDevice() {
        return device;
    }

    public String getPlatform() {
        return platform;
    }

    // ✅ Setters
    public void setRefId(String refId) {
        this.refId = refId;
    }

    public void setMblNo(String mblNo) {
        this.mblNo = mblNo;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
