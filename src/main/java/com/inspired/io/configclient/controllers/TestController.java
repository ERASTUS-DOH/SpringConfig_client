package com.inspired.io.configclient.controllers;

import com.inspired.io.configclient.configuration.DbSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    DbSettings dbSettings;

    @GetMapping("/endpoint")
    public String retriveConnection(){
        return this.dbSettings.getConnection();
    }
}
