package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yan
 * @Date: 2020/4/13 19:14
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulApplication.class,args);
    }
}
