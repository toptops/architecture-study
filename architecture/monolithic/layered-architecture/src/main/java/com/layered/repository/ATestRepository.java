package com.layered.repository;

import com.layered.repository.entity.ATestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ATestRepository extends JpaRepository<ATestEntity, Long> , CustomATestRepository{
    ATestEntity selectByOne();
}
