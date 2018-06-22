package com.sample.microservice.app1.service;

import com.sample.microservice.app1.dto.App1InformationDTO;

import java.io.Serializable;

public interface App1InformationService extends Serializable {

    App1InformationDTO getApp1Information();
}
