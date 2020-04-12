package com.yan.springcloud.dao;

import com.yan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: yan
 * @Date: 2020/4/11 16:48
 * @Description: com.yan.springcloud.dao
 * @version: 1.0
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
