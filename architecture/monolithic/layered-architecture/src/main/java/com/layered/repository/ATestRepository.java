package com.layered.repository;

import com.layered.domain.ATest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ATestRepository extends JpaRepository<ATest, Long> {
    ATest selectByOne();
}
