package com.sbi.yono.Yono30.Repository;

import com.sbi.yono.Yono30.Entity.AddharDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddharDetailsRepo extends JpaRepository<AddharDetails,String> {
}
