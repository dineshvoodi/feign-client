package com.learning.spring.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Here if there is no Service registry, we have to give URL of the service
 * and name as spring application name of the service
 *
 * If service registry is there, then no need to provide URL
 */
//@FeignClient(name = "eureka-client", url = "http://localhost:8080")
@FeignClient(name = "eureka-client")
public interface FeignService {

    @GetMapping(value = "/getStatus")
    public String callStatus();

    @GetMapping(value = "/hello/{name}")
    public String welcome(@PathVariable String name);

}
