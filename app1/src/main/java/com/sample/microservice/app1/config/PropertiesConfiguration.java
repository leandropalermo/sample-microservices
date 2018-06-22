package com.sample.microservice.app1.config;

import com.sample.microservice.app1.properties.App1Properties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(App1Properties.class)
public class PropertiesConfiguration {
}
