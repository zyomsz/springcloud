package com.yomsz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * The preson who loves you has gone night and night,
 * walking on the way.
 *
 * @purpose:
 * @data: 2021/1/7 20:53
 * @author: Mr. zhao
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class,args);
    }
}
