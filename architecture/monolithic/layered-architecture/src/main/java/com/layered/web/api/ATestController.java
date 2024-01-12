package com.layered.web.api;

import com.layered.service.ATestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Web 계층, 즉 프레젠테이션 계층
 * 해당 계층에서는 비지니스 계층에 의존한다.
 */
@RestController
@RequestMapping("/a")
@RequiredArgsConstructor
public class ATestController {
    private final ATestService aTestServiceImpl;
    private final ATestConvertor aTestConvertor;

    /**
     * 비지니스 계층 서비스(ATestService.class)에서 ATestResponse.class를 직접 리턴해주는 API
     * 서비스 계층이 프레젠테이션 계층 DTO에 의존성이 들어가버리는 상황, 만약 DTO가 바뀌면 서비스 계층도 변경되야 한다.
     *
     * @return
     */
    @GetMapping
    public ATestResponse directToService() {
        ATestResponse response = aTestServiceImpl.directToService();
        return response;
    }

    /**
     * 비지니스 계층 서비스(ATestService.class)에서 데이터만 받아와서 Response DTO를 프레젠테이션 계층에서 만들어주는 API
     * 위 문제가 해결되지만 직접 Response DTO를 만들어주는 서비스를 따로 만들어야 한다.
     *
     * @return
     */
    @GetMapping
    public ATestResponse indirectToService() {
        ATestResponse response = aTestConvertor.indirectToService();
        return response;
    }
}
