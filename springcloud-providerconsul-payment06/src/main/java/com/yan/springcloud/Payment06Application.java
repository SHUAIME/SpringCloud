package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yan
 * @Date: 2020/4/13 19:06
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment06Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment06Application.class,args);
    }
}
