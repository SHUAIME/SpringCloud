package com.yan.springcloud.service;

import com.yan.springcloud.entities.CommonResult;
import com.yan.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: yan
 * @Date: 2020/4/16 10:31
 * @Description: com.yan.springcloud.service
 * @version: 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}

