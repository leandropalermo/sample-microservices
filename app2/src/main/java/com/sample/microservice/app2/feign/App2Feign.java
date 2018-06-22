package com.sample.microservice.app2.feign;

import com.sample.microservice.app2.dto.App2InformationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app1")
public interface App2Feign {

    @GetMapping("/app1/information")
    App2InformationDTO getInformationFromApp1();
}
