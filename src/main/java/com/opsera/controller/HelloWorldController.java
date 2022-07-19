package com.opsera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value="/test")
    public String hello() {
        return "Opsera EBS Testing Runcount 59 with Domain and Zone id sephora testing";
    }
}
