package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: yan
 * @Date: 2020/4/13 22:32
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignApplicatiom {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApplicatiom.class,args);
    }
}
