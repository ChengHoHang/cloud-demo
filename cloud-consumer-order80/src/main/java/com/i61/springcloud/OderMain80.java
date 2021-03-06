package com.i61.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenhaoheng
 * @Date: 2020-08-25
 */
@SpringBootApplication
@EnableEurekaClient
public class OderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OderMain80.class, args);
    }
}
