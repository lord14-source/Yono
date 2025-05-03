package com.sbi.yono.Yono30.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class TempBlock {

    @Id
    private String refNo;
    private String mblNo;

    public TempBlock(LocalDateTime crtdOn) {
        this.crtdOn = crtdOn;
    }

    private LocalDateTime crtdOn;
    private LocalDateTime updtOn;

    public TempBlock(String refNo) {
        this.refNo = refNo;
    }

    public TempBlock() {

    }

    public LocalDateTime getUpdtOn() {
        return updtOn;
    }

    public void setUpdtOn(LocalDateTime updtOn) {
        this.updtOn = updtOn;
    }

    public LocalDateTime getCrtdOn() {
        return crtdOn;
    }

    public void setCrtdOn(LocalDateTime crtdOn) {
        this.crtdOn = crtdOn;
    }

    public String getMblNo() {
        return mblNo;
    }

    public void setMblNo(String mblNo) {
        this.mblNo = mblNo;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }
}
