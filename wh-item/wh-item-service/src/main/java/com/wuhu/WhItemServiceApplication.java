package com.wuhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //让注册中心能够发现，扫描到该服务
public class WhItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhItemServiceApplication.class);
    }
}
