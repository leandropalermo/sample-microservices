package com.sample.microservice.app1.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.information")
@Data
public class App1Properties {

    private String name;
    private String description;

}
