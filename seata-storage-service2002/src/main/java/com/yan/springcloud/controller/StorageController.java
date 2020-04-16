package com.yan.springcloud.controller;

import com.yan.springcloud.entity.CommonResult;
import com.yan.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: yan
 * @Date: 2020/4/16 13:27
 * @Description: com.yan.springcloud.controller
 * @version: 1.0
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功!");
    }
}



