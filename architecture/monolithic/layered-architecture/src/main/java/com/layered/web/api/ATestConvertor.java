package com.layered.web.api;

import com.layered.service.ATestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ATestConvertor {
    private final ATestService aTestServiceImpl;

    public ATestResponse indirectToService() {
        return new ATestResponse(aTestServiceImpl.indirectToService());
    }
}
