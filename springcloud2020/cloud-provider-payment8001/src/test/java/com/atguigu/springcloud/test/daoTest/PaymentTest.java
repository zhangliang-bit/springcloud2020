package com.atguigu.springcloud.test.daoTest;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author ZL
 * @Date 2020/5/15 17:48
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PaymentTest {
    @Autowired
    private PaymentDao paymentDao;

    @Test
    public void PaymentTest1() {
        Payment payment=new Payment();
        payment.setSerial("9");
        int i = paymentDao.create(payment);
        System.out.println("插入成功"+i);
    }


    @Test
    public void PaymentTest2() {
        Long id=2L;
        Payment paymentById = paymentDao.getPaymentById(id);
        System.out.println("查询成功"+paymentById);
    }



}
