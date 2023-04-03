package com.mockService.mockService.service.impl;

import com.mockService.mockService.controller.RestEndpointsController;
import com.mockService.mockService.service.PranRFlRechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PranRFlRechargeServiceImpl implements PranRFlRechargeService {
    @Autowired
    private RestEndpointsController restEndpointsController;
    @Override
    public String getPranRflSuccessRes() {
        return "{\"Message\":\"Successful\",\"status_code\":200,\"Trx_id\":\"BD08251053160527\"}";
    }
    @Override
    public String getToken() {
        return "{\"access_token\":\"1234\",\"expires_in\":\"1693817474000\",\"token_type\":\"test\"}";
    }

    @Override
    public String getPranRFLFailResponse() {
        return "{\"Message\":\"authentication Error\",\"status_code\":206,\"Trx_id\":\"PR202209051610174548\"}";
    }


}
