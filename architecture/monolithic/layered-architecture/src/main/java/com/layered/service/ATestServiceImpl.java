package com.layered.service;

import com.layered.infra.mysql.entity.ATestEntity;
import com.layered.infra.mysql.entity.TestEnum;
import com.layered.service.domain.ATest;
import com.layered.infra.mysql.repository.ATestRepository;
import com.layered.service.domain.ATestEnum;
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
        ATestEnum aTestEnum = convertEnum(aTestEntity.getTestEnum());
        ATest aTest = new ATest(aTestEntity.getId(), aTestEntity.getData(), aTestEnum);
        return new ATestResponse(aTest.getData());
    }

    @Override
    public String indirectToService() {
        ATestEntity aTestEntity = aTestRepository.selectByOne();
        ATestEnum aTestEnum = convertEnum(aTestEntity.getTestEnum());
        ATest aTest = new ATest(aTestEntity.getId(), aTestEntity.getData(), aTestEnum);
        return aTest.getData();
    }

    private ATestEnum convertEnum(TestEnum testEnum) {
        return ATestEnum.TEST;
    }
}
