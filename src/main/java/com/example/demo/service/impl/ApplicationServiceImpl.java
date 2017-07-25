package com.example.demo.service.impl;

import com.example.demo.dto.VersionDto;
import com.example.demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by xabier on 25/07/2017.
 */
@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Value("${project.version}")
    String version;


    @Override
    public VersionDto getVersionFromPom() throws IOException {
        VersionDto versionDto = new VersionDto(version);
        return versionDto;
    }
}
