package com.sample.microservice.app2.service;

import com.sample.microservice.app2.dto.App2InformationDTO;
import org.springframework.hateoas.Resource;

public interface App2Service {
    Resource<App2InformationDTO> getInformationFromApp1();
}
