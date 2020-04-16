package com.yan.springcloud.controller;

import com.yan.springcloud.entities.CommonResult;
import com.yan.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author: yan
 * @Date: 2020/4/16 10:16
 * @Description: com.yan.springcloud.controller
 * @version: 1.0
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private  String serverPort;

    public static HashMap<Long, Payment> map = new HashMap<>();
    static {
        map.put(1L,new Payment(1L,"1111"));
        map.put(1L,new Payment(2L,"2222"));
        map.put(1L,new Payment(3L,"3333"));
    }
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = map.get(id);
        CommonResult<Payment> result = new CommonResult<>(200,"from mysql,serverPort: " + serverPort,payment);
        return result;
    }
}



