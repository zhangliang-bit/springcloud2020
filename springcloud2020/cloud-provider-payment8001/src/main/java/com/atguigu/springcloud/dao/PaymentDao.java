package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author ZL
 * @Date 2020/5/15 17:27
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);
}
