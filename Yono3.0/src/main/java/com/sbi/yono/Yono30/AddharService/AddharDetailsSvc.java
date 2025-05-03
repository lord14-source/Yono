package com.sbi.yono.Yono30.AddharService;

import com.sbi.yono.Yono30.Entity.AddharDetails;
import com.sbi.yono.Yono30.Entity.AddharResponseOtp;
import com.sbi.yono.Yono30.Utils.AddharRequest;

public interface AddharDetailsSvc {

    public AddharResponseOtp create(AddharRequest addharRequest);
    public AddharDetails get(String id);
}
