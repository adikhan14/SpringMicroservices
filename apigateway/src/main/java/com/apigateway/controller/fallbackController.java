package com.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fallbackController {

    @RequestMapping("/userServiceFallback")
    public String userServiceFallBack(){
        return "User Service is down at this time";
    }

    @RequestMapping("/contactServiceFallback")
    public String contactServiceFallback(){
        return "Contact Service is down at this time";
    }
}
