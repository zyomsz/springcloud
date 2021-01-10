package com.yomsz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The preson who loves you has gone night and night,
 * walking on the way.
 *
 * @purpose:
 * @data: 2021/1/8 0:07
 * @author: Mr. zhao
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class MovieApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class,args);
    }
}
