package com.mockService.mockService.service;

public interface RocketCheckoutService {

    public String getTxnId();

    public String redirectURL(String cardType,String txnId);

    public String getResultField();

}
