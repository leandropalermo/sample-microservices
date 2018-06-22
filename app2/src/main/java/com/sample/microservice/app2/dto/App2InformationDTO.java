package com.sample.microservice.app2.dto;

import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

@Data
public class App2InformationDTO  extends ResourceSupport {
    private String name;
    private String description;
}
