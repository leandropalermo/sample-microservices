package com.sample.microservice.app1.converter;

import com.sample.microservice.app1.dto.App1InformationDTO;
import com.sample.microservice.app1.properties.App1Properties;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class App1PropertiesToApp1InformationDTOConverter implements Converter<App1Properties, App1InformationDTO> {

    @Override
    public App1InformationDTO convert(App1Properties app1Properties) {
        App1InformationDTO app1InformationDTO = App1InformationDTO.builder()
                .description(app1Properties.getDescription())
                .name(app1Properties.getName())
                .build();

        return app1InformationDTO;
    }
}
