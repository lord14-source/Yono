package com.sbi.yono.Yono30.Repository;

import com.sbi.yono.Yono30.Entity.MobileDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MobileRegisterRepo extends JpaRepository<MobileDetails,String> {
    Optional<MobileDetails>findBymblNo(String MblNo);
}
