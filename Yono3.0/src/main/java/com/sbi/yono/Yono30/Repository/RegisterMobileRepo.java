package com.sbi.yono.Yono30.Repository;

import com.sbi.yono.Yono30.Entity.RegisterMobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterMobileRepo extends JpaRepository<com.sbi.yono.Yono30.Entity.RegisterMobile,String> {
    Optional<RegisterMobile> findByMblNo(String mobileNumber);}
