package com.yan.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: yan
 * @Date: 2020/4/11 15:42
 * @Description: com.yan.springcloud.entities
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
