package com.yan.springcloud.controller;

import com.yan.springcloud.entities.CommonResult;
import com.yan.springcloud.entities.Payment;
import com.yan.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: yan
 * @Date: 2020/4/13 22:34
 * @Description: com.yan.springcloud.controller
 * @version: 1.0
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

}
