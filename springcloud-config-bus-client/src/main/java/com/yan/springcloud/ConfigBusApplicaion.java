package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yan
 * @Date: 2020/4/15 12:35
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigBusApplicaion {

    public static void main(String[] args) {
        SpringApplication.run(ConfigBusApplicaion.class,args);
    }
}