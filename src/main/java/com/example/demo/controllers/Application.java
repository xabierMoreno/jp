package com.example.demo.controllers;

import com.example.demo.dto.VersionDto;
import com.example.demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by xabier on 25/07/2017.
 */

@RestController
public class Application {

    @Autowired
    ApplicationService applicationService;

    @RequestMapping(value = "/version",method = RequestMethod.GET)
    VersionDto version() throws IOException {
        VersionDto version = applicationService.getVersionFromPom();
        return version;
    }
}
