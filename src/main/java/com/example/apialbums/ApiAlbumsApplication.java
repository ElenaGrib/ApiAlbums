package com.example.apialbums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiAlbumsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiAlbumsApplication.class, args);
    }

}
