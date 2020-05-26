package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author ZL
 * @Date 2020/5/23 23:36
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";

    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";

    }
}
