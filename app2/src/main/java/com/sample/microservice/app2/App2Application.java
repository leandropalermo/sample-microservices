package com.sample.microservice.app2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class App2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                App2Application.class
        ).run(args);
    }

}
