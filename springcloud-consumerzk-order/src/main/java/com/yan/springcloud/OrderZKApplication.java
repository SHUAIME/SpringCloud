package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yan
 * @Date: 2020/4/12 22:51
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderZKApplication.class,args);
    }
}
