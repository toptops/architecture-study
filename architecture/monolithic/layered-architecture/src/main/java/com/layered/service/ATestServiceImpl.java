package com.layered.service;

import com.layered.repository.entity.ATestEntity;
import com.layered.service.domain.ATest;
import com.layered.repository.ATestRepository;
import com.layered.web.api.ATestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * ATest.class와 ATestEntity.class는 서로 다른 계층이지만 의미적으로는 같은 객체이다.
 */
@Service
@RequiredArgsConstructor
public class ATestServiceImpl implements ATestService{

    private final ATestRepository aTestRepository;

    @Override
    public ATestResponse directToService() {
        ATestEntity aTestEntity = aTestRepository.selectByOne();
        ATest aTest = new ATest(aTestEntity.getId(), aTestEntity.getData());
        return new ATestResponse(aTest.getData());
    }

    @Override
    public String indirectToService() {
        ATestEntity aTestEntity = aTestRepository.selectByOne();
        ATest aTest = new ATest(aTestEntity.getId(), aTestEntity.getData());
        return aTest.getData();
    }


}
