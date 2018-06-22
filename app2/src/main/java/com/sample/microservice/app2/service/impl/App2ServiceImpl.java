package com.sample.microservice.app2.service.impl;

import com.sample.microservice.app2.dto.App2InformationDTO;
import com.sample.microservice.app2.feign.App2Feign;
import com.sample.microservice.app2.service.App2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.stereotype.Service;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@Service
public class App2ServiceImpl implements App2Service {

    @Autowired
    private App2Feign app2Feign;

    @Override
    public Resource<App2InformationDTO> getInformationFromApp1() {
        App2InformationDTO app2InformationDTO = app2Feign.getInformationFromApp1();
        Link link = linkTo(App2InformationDTO.class).withSelfRel();
        Resource<App2InformationDTO> resources = new Resource(app2InformationDTO, link);
        return resources;
    }
}
