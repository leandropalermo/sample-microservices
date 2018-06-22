package com.sample.microservice.app2.controller;

import com.sample.microservice.app2.dto.App2InformationDTO;
import com.sample.microservice.app2.service.App2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app2/information")
public class App2Controller {

    @Autowired
    private App2Service app2Service;

    @GetMapping
    public ResponseEntity getApp2Information() {
        Resource<App2InformationDTO> app2InformationDTOResource = app2Service.getInformationFromApp1();
        return ResponseEntity.ok().body(app2InformationDTOResource);
    }
}
