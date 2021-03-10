package com.brki.rate.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateController {
    @Value("${app.name:default}")
    private String appName;

    @GetMapping("/appname")
    public String getRate() {
        return "response from : " + appName;
    }
}
