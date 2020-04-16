package com.yan.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yan
 * @Date: 2020/4/16 16:17
 * @Description: com.yan.springcloud.config
 * @version: 1.0
 */
@Configuration
@MapperScan({"com.yan.springcloud.dao"})
public class MyBatisConfig {


}
