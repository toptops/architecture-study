package com.layered.repository;

import com.layered.domain.ATest;
import org.springframework.stereotype.Component;

@Component
public interface ATestRepository {
    ATest selectByOne();
}
