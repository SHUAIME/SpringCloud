package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yan
 * @Date: 2020/4/13 23:34
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication.class,args);
    }
}
