package com.mockService.mockService.service.impl;

import com.mockService.mockService.service.RocketToTallyPayService;

public class RocketToTallyPayServiceImpl implements RocketToTallyPayService {
    @Override
    public String getToken() {
        return "{\"token\":\"200\",\"Message\":\"Successful\",\"Trx_id\":\"R220523.0753.25001d\"}";
    }
}
