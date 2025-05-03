package com.sbi.yono.Yono30.Controllers;

import com.sbi.yono.Yono30.AddharService.AddharDetailsSvc;
import com.sbi.yono.Yono30.Entity.AddharDetails;
import com.sbi.yono.Yono30.Entity.AddharResponseOtp;
import com.sbi.yono.Yono30.Utils.AddharRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddharRegistration")
public class AddharController {
    @Autowired
    private AddharDetailsSvc addharDetailsSvc;

    @PostMapping
    public ResponseEntity<AddharResponseOtp>create(@RequestBody AddharRequest addharRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(addharDetailsSvc.create(addharRequest));
    }
    @GetMapping
    public ResponseEntity<AddharDetails>getId(String id){
        return ResponseEntity.status(HttpStatus.OK).body(addharDetailsSvc.get(id));
    }
}
