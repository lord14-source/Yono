package com.sbi.yono.Yono30.Utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class GenerateUUID
{

    public String UUIDNo(){
        String res="";
        res+="SBI";
        res+="YONO2";
        res+= LocalDateTime.now().toString();
        return res;
    }
}
