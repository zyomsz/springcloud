package com.yomsz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * The preson who loves you has gone night and night,
 * walking on the way.
 *
 * @purpose:
 * @data: 2021/1/8 0:25
 * @author: Mr. zhao
 **/
//@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
