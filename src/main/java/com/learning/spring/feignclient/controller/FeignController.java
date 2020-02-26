package com.learning.spring.feignclient.controller;

import com.learning.spring.feignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService service;

    @GetMapping(value = "/callStatus", produces = MediaType.APPLICATION_JSON_VALUE)
    public String callStatus() {

        return service.callStatus();

    }

    @GetMapping(value = "/welcome/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String welcome(@PathVariable String name) {

        return service.welcome(name);

    }

}
