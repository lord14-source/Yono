package com.sbi.yono.Yono30.Repository;

import com.sbi.yono.Yono30.Entity.TempBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TempBlockRepo extends JpaRepository<TempBlock,String> {
    Optional<TempBlock>findBymblNo(String mblNo);
}
