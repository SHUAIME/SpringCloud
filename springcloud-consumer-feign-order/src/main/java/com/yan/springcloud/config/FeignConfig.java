package com.yan.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yan
 * @Date: 2020/4/13 23:03
 * @Description: com.yan.springcloud.config
 * @version: 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
