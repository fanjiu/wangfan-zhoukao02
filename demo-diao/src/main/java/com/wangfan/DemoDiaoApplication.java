package com.wangfan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class DemoDiaoApplication {
    public static void main(String[] ages){
        SpringApplication.run(DemoDiaoApplication.class,ages);
    }
}
