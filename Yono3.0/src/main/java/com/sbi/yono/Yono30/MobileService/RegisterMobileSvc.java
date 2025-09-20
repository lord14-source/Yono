package com.sbi.yono.Yono30.MobileService;

import com.sbi.yono.Yono30.Entity.RegisterMobile;

public interface RegisterMobileSvc {

    public String create(RegisterMobile registerMobile);
    public RegisterMobile getMobile(String mblNo);
    public RegisterMobile getById(String Id);


}
