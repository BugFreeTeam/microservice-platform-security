package com.mall.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class MicroservicePlatformSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicePlatformSecurityApplication.class, args);
    }

}