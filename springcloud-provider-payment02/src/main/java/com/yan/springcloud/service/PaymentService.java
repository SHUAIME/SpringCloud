package com.yan.springcloud.service;

import com.yan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: yan
 * @Date: 2020/4/12 17:36
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
