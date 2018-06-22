package com.sample.microservice.app1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class App1InformationDTO extends ResourceSupport {
    private String name;
    private String description;
}
