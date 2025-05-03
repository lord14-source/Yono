package com.sbi.yono.Yono30.Controllers;

import com.sbi.yono.Yono30.Entity.RegisterMobile;
import com.sbi.yono.Yono30.MobileService.RegisterMobileSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Registraion")
public class CustomerController {
    @Autowired
    private RegisterMobileSvc registerMobileSvc;
    @PostMapping()
    public ResponseEntity<String>create(@RequestBody RegisterMobile registerMobile){
        return ResponseEntity.status(HttpStatus.CREATED).body(registerMobileSvc.create(registerMobile));
    }

    @GetMapping()
    public ResponseEntity<RegisterMobile>getMobileNo(String mblNo){
        return ResponseEntity.status(HttpStatus.OK).body(registerMobileSvc.getMobile(mblNo));
    }
}
