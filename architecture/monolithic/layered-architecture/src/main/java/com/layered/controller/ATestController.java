package com.layered.controller;

import com.layered.dto.ATestResponse;
import com.layered.service.ATestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("a")
@RequiredArgsConstructor
public class ATestController {
    private final ATestService aTestServiceImpl;

    @GetMapping
    public ATestResponse test() {
        ATestResponse response = new ATestResponse(aTestServiceImpl.test());
        return response;
    }
}
