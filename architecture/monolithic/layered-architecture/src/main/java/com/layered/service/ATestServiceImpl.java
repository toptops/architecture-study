package com.layered.service;

import com.layered.domain.ATest;
import com.layered.dto.ATestResponse;
import com.layered.repository.ATestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ATestServiceImpl implements ATestService{

    private final ATestRepository aTestRepository;

    public ATestResponse test() {
        ATest aTest = aTestRepository.selectByOne();
        return new ATestResponse(aTest.getData());
    }
}
