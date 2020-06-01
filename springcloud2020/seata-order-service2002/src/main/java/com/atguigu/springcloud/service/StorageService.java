package com.atguigu.springcloud.service;

/**
 * @Author ZL
 * @Date 2020/5/31 20:39
 * @Version 1.0
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);

}
