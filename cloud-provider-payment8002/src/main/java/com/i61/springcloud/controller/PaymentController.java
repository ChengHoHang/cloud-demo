package com.i61.springcloud.controller;

import com.i61.springcloud.entites.CommonResult;
import com.i61.springcloud.entites.Payment;
import com.i61.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author chenhaoheng
 * @Date: 2020-08-24
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果： ---" + result);

        if (result > 0) {
            return new CommonResult(200, "插入成功", result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果： ---" + payment);

        if (payment != null) {
            return new CommonResult(200, "查询成功, 查询端口为：" + serverPort, payment);
        } else {
            return new CommonResult(444, "查询失败，无记录", null);
        }
    }

}
