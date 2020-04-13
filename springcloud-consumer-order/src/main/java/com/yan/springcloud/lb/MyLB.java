package com.yan.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: yan
 * @Date: 2020/4/13 21:42
 * @Description: com.yan.springcloud.lb
 * @version: 1.0
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147383647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("第几次访问, 次数next : "+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
