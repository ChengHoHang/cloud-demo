package com.i61.springcloud.service;

import com.i61.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author chenhaoheng
 * @Date: 2020-08-24
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
