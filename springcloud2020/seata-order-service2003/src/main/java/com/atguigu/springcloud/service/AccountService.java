package com.atguigu.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author ZL
 * @Date 2020/5/31 21:18
 * @Version 1.0
 */

public interface AccountService {
    /**
     * 扣减账户余额x
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
