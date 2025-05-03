package com.sbi.yono.Yono30.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AddharDetails {

    @Id
    private String refNo;
    private String uid;
    private String addharData;

    // No-arg constructor
    public AddharDetails() {
    }

    // All-arg constructor
    public AddharDetails(String refNo, String uid, String addharData) {
        this.refNo = refNo;
        this.uid = uid;
        this.addharData = addharData;
    }

    // Getters and Setters
    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAddharData() {
        return addharData;
    }

    public void setAddharData(String addharData) {
        this.addharData = addharData;
    }
}
