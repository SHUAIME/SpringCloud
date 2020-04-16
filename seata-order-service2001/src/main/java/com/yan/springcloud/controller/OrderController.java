package com.yan.springcloud.controller;

import com.yan.springcloud.entity.CommonResult;
import com.yan.springcloud.entity.Order;
import com.yan.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: yan
 * @Date: 2020/4/16 13:04
 * @Description: com.yan.springcloud.controller
 * @version: 1.0
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
