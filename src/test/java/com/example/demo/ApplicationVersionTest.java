package com.example.demo;

import com.example.demo.dto.VersionDto;
import com.example.demo.service.ApplicationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Created by xabier on 25/07/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationVersionTest {

    @Autowired
    private ApplicationService applicationService;

    @Test
    public void applicationVersionTest() throws IOException {
        VersionDto versionFromPom = applicationService.getVersionFromPom();
        Assert.assertEquals(versionFromPom.getVersion(), "0.0.1");
    }
}
