package com.sbi.yono.Yono30.MobileService;

import com.sbi.yono.Yono30.Entity.MobileDetails;
import com.sbi.yono.Yono30.Entity.RegisterMobile;
import com.sbi.yono.Yono30.Entity.TempBlock;
import com.sbi.yono.Yono30.GlobalException.ResourceNotFoundException;
import com.sbi.yono.Yono30.Repository.MobileRegisterRepo;
import com.sbi.yono.Yono30.Repository.RegisterMobileRepo;
import com.sbi.yono.Yono30.Repository.TempBlockRepo;
import com.sbi.yono.Yono30.Utils.GenerateUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class RegisterMobileDao implements RegisterMobileSvc
{

    @Autowired
    private GenerateUUID generateUUID;
    @Autowired
    private RegisterMobileRepo registerMobileRepo;
    @Autowired
    private MobileRegisterRepo mobileRegisterRepo;
    @Autowired
    private TempBlockRepo tempBlockRepo;


    @Override
    public String create(RegisterMobile registerMobile) {
       Optional<RegisterMobile> res=registerMobileRepo.findBymblNo(registerMobile.getMblNo());


       if(res.isEmpty()) {
           System.out.println("this is the part");

           String ref=generateUUID.UUIDNo();
           registerMobile.setRefId(ref);
           System.out.println(registerMobile.getDevice());
           System.out.println(registerMobile.getMblNo());
           registerMobileRepo.save(registerMobile);
           MobileDetails mobileDetails=new MobileDetails();

           mobileDetails.setCount(1);
           mobileDetails.setCrtdOn(LocalDateTime.now());
           mobileDetails.setmblNo(registerMobile.getMblNo());
           mobileDetails.setUpdtOn(LocalDateTime.now());
           mobileDetails.setRefNo(ref);
           mobileRegisterRepo.save(mobileDetails);


           return ref;

       }
else{

           Optional<MobileDetails>mobileDetails=mobileRegisterRepo.findBymblNo(registerMobile.getMblNo());
           Optional<TempBlock>tempBlock1=tempBlockRepo.findBymblNo(registerMobile.getMblNo());

System.out.println(mobileDetails.get().getCount());
           if ((mobileDetails.isPresent() && (mobileDetails.get().getCount() < 5))||(tempBlock1.isPresent()&&LocalDateTime.now().isAfter(tempBlock1.get().getCrtdOn().plusMinutes(30)))) {


              MobileDetails mobileDetails1=new MobileDetails();
              mobileDetails1.setRefNo(mobileDetails.get().getRefNo());
              mobileDetails1.setUpdtOn(LocalDateTime.now());
              mobileDetails1.setCrtdOn(mobileDetails.get().getCrtdOn());
              mobileDetails1.setmblNo(registerMobile.getMblNo());
              mobileDetails1.setCount(mobileDetails.get().getCount()+1);
              mobileRegisterRepo.save(mobileDetails1);
              return "You are registered again";

            } else {
               TempBlock tempBlock=new TempBlock();
               tempBlock.setCrtdOn(LocalDateTime.now());
               tempBlock.setMblNo(mobileDetails.get().getmblNo());
               tempBlock.setRefNo(mobileDetails.get().getRefNo());

tempBlockRepo.save(tempBlock);


                return "Please try after 30 Minutes";
            }
        }

    }

    @Override
    public RegisterMobile getMobile(String mblNo) {
        return (RegisterMobile) registerMobileRepo.findBymblNo(mblNo).orElseThrow(()->new ResourceNotFoundException("Mobile Number is not registered"));
    }
}
