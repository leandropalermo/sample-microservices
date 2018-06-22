package com.sample.microservice.app1;

import com.sample.microservice.app1.config.EurekaConfiguration;
import com.sample.microservice.app1.config.PropertiesConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App1Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(
                App1Application.class,
                PropertiesConfiguration.class,
                EurekaConfiguration.class
        ).run(args);
    }
}
