package com.yan.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yan
 * @Date: 2020/4/11 16:44
 * @Description: com.yan.springcloud.entities
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
