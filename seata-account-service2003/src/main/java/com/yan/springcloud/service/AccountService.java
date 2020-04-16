package com.yan.springcloud.service;

import java.math.BigDecimal;

/**
 * @Author: yan
 * @Date: 2020/4/16 13:34
 * @Description: com.yan.springcloud.service
 * @version: 1.0
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}


