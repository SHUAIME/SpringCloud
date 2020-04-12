package com.yan.springcloud.service.impl;

import com.yan.springcloud.dao.PaymentDao;
import com.yan.springcloud.entities.Payment;
import com.yan.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: yan
 * @Date: 2020/4/12 17:38
 * @Description: com.yan.springcloud.service.impl
 * @version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
