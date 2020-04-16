package com.yan.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: yan
 * @Date: 2020/4/16 13:24
 * @Description: com.yan.springcloud.dao
 * @version: 1.0
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}



