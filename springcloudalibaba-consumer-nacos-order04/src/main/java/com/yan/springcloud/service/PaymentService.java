package com.yan.springcloud.service;

import com.yan.springcloud.entities.CommonResult;
import com.yan.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: yan
 * @Date: 2020/4/16 10:30
 * @Description: com.yan.springcloud.service
 * @version: 1.0
 */

@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
