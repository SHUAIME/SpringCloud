package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yan
 * @Date: 2020/4/15 21:57
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceApplication.class,args);
    }
}