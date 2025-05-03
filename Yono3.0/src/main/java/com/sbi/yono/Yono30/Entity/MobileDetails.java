package com.sbi.yono.Yono30.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class MobileDetails {
    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    @Id
    @Column
    private String refNo;

    public MobileDetails(String refNo) {
        this.refNo = refNo;
    }

    @Column
    private String mblNo;
    private Integer count;
    private LocalDateTime crtdOn;
    private LocalDateTime updtOn;

    // ✅ No-args constructor
    public MobileDetails() {
    }

    // ✅ All-args constructor
    public MobileDetails(String mblNo, Integer count, LocalDateTime crtdOn, LocalDateTime updtOn) {
        this.mblNo = mblNo;
        this.count = count;
        this.crtdOn = crtdOn;
        this.updtOn = updtOn;
    }

    // ✅ Getters
    public String getmblNo() {
        return mblNo;
    }

    public Integer getCount() {
        return count;
    }

    public LocalDateTime getCrtdOn() {
        return crtdOn;
    }

    public LocalDateTime getUpdtOn() {
        return updtOn;
    }

    // ✅ Setters
    public void setmblNo(String mblNo) {
        this.mblNo = mblNo;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setCrtdOn(LocalDateTime crtdOn) {
        this.crtdOn = crtdOn;
    }

    public void setUpdtOn(LocalDateTime updtOn) {
        this.updtOn = updtOn;
    }
}
