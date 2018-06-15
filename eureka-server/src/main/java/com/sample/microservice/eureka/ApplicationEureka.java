package com.sample.microservice.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApplicationEureka {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationEureka.class).run(args);
    }
}
