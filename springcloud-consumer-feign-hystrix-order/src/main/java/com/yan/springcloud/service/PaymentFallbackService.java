package com.yan.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: yan
 * @Date: 2020/4/14 19:29
 * @Description: com.yan.springcloud.service
 * @version: 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
