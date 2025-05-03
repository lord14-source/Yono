package com.sbi.yono.Yono30.Utils;

import jakarta.persistence.Id;

public class AddharRequest {
    @Id
    private String refNo;
    private String uid;


    // No-arg constructor
    public AddharRequest() {
    }

    // All-arg constructor
    public AddharRequest(String refNo, String uid) {
        this.refNo = refNo;
        this.uid = uid;

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


}
