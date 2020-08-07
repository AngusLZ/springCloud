package com.learn.hack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HackServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HackServerApplication.class, args);
    }

}
