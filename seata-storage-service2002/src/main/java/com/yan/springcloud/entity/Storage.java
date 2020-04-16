package com.yan.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yan
 * @Date: 2020/4/16 13:19
 * @Description: com.yan.springcloud
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;

    private Integer total;

    private Integer used;

    private Integer  residue;
}



