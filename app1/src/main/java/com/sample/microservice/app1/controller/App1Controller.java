package com.sample.microservice.app1.controller;

import com.sample.microservice.app1.dto.App1InformationDTO;
import com.sample.microservice.app1.properties.App1Properties;
import com.sample.microservice.app1.service.App1InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
@RequestMapping("/app1/information")
public class App1Controller {

    @Autowired
    private App1InformationService app1InformationService;

    @GetMapping(produces = { "application/hal+json" })
    public Resource<App1InformationDTO> getApp1Information(){
        App1InformationDTO app1InformationDTO = app1InformationService.getApp1Information();
        Link link = linkTo(App1InformationDTO.class).withSelfRel();
        Resource<App1InformationDTO> resources = new Resource(app1InformationDTO, link);
        return resources;
    }
}
