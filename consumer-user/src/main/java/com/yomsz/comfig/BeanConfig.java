package com.yomsz.comfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * The preson who loves you has gone night and night,
 * walking on the way.
 *
 * @purpose:
 * @data: 2021/1/8 0:41
 * @author: Mr. zhao
 **/
@Configuration
public class BeanConfig {
    //负载均衡rubbon
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
