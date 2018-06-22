package com.sample.microservice.app1.service.impl;

import com.sample.microservice.app1.properties.App1Properties;
import com.sample.microservice.app1.dto.App1InformationDTO;
import com.sample.microservice.app1.service.App1InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class App1InformationServiceImpl implements App1InformationService {

    private static final long serialVersionUID = 3412051001019577067L;

    @Autowired
    private App1Properties app1Properties;

    @Autowired
    ConversionService conversionService;

    @Override
    public App1InformationDTO getApp1Information() {
        App1InformationDTO app1InformationDTO = conversionService.convert(app1Properties, App1InformationDTO.class);
        return app1InformationDTO;
    }
}
