package com.example.demo.service;

import com.example.demo.dto.VersionDto;

import java.io.IOException;

/**
 * Created by xabier on 25/07/2017.
 */
public interface ApplicationService {

    //Get version from pom
    VersionDto getVersionFromPom() throws IOException;
}
