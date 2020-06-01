package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @Author ZL
 * @Date 2020/5/31 19:35
 * @Version 1.0
 */
public interface OrderService {

    void create(Order order);

}
