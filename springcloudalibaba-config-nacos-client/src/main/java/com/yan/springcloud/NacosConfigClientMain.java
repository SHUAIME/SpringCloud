package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yan
 * @Date: 2020/4/15 19:18
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain.class,args);
    }
}