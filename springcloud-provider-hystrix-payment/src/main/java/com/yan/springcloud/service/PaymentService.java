package com.yan.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: yan
 * @Date: 2020/4/13 23:35
 * @Description: com.yan.springcloud.service
 * @version: 1.0
 */
@Service
public class PaymentService {

    /**
     * 成功
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"哈哈哈"  ;
    }

    /**
     * 失败
     * @param id
     * @return
     */
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try { TimeUnit.SECONDS.sleep(timeNumber); }catch (Exception e) {e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"呜呜呜"+" 耗时(秒)"+timeNumber;
    }
}

