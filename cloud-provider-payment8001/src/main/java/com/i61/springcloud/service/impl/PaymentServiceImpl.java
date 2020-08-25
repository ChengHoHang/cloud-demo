package com.i61.springcloud.service.impl;

import com.i61.springcloud.dao.PaymentDao;
import com.i61.springcloud.entites.Payment;
import com.i61.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenhaoheng
 * @Date: 2020-08-24
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
