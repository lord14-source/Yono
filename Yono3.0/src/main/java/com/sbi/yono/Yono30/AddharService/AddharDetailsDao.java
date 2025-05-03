package com.sbi.yono.Yono30.AddharService;

import com.sbi.yono.Yono30.Entity.AddharDetails;
import com.sbi.yono.Yono30.Entity.AddharResponseOtp;
import com.sbi.yono.Yono30.Entity.RegisterMobile;
import com.sbi.yono.Yono30.External.Addhar;
import com.sbi.yono.Yono30.External.AddharService;
import com.sbi.yono.Yono30.GlobalException.ResourceNotFoundException;
import com.sbi.yono.Yono30.Repository.AddharDetailsRepo;
import com.sbi.yono.Yono30.Repository.RegisterMobileRepo;
import com.sbi.yono.Yono30.Utils.AddharRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddharDetailsDao implements AddharDetailsSvc{

    @Autowired
    private RegisterMobileRepo registerMobileRepo;
    @Autowired
    private AddharDetailsRepo addharDetailsRepo;
    @Autowired
    private AddharService addharService;
    @Override
    public AddharResponseOtp create(AddharRequest addharRequest) {
        Optional<RegisterMobile>findId=registerMobileRepo.findById(addharRequest.getRefNo());
       if(findId.isPresent()){
           AddharDetails addharDetails=new AddharDetails();
           addharDetails.setUid(addharRequest.getUid());
           addharDetails.setRefNo(addharRequest.getRefNo());
System.out.println("Enter");
System.out.println("hello");
Addhar addhar=addharService.getAddhar(addharRequest.getUid());
System.out.println("Exit");
System.out.println("this");
System.out.println("that");
System.out.println(addhar);
System.out.println("dassa");
        
addharDetails.setAddharData(addhar.getAddharData());
           addharDetailsRepo.save(addharDetails);
           AddharResponseOtp otp=new AddharResponseOtp();
           otp.setRefNo(addharRequest.getRefNo());
           otp.setOtp(addhar.getOtp());
           return otp;


       }
       else{
            throw new IllegalArgumentException("Your Addhar is not registered");
       }
    }

    @Override
    public AddharDetails get(String id) {
        return addharDetailsRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("You are not yet registered"));
    }
}
