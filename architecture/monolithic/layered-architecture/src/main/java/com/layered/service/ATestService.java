package com.layered.service;

import com.layered.web.api.ATestResponse;

public interface ATestService {
    ATestResponse directToService();
    String indirectToService();
}
