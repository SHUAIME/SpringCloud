package com.yan.springcloud.MyHandker;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yan.springcloud.entities.CommonResult;
import com.yan.springcloud.entities.Payment;

/**
 * @Author: yan
 * @Date: 2020/4/15 23:39
 * @Description: com.yan.springcloud.MyHandker
 * @version: 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义的Glogal 全局异常处理 ---- 1",new Payment(2020L,"serial003"));
    }

    public static CommonResult handlerException2(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义的Glogal 全局异常处理 ---- 2",new Payment(2020L,"serial003"));
    }
}



