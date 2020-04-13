package com.yan.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: yan
 * @Date: 2020/4/13 21:41
 * @Description: com.yan.springcloud.lb
 * @version: 1.0
 */
public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
