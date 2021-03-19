package com.brki.rate.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateController {
    @Value("${app.name:rate java}")
    private String appName;
    @Value("${env_name:default env} - aprika daprika booooo!")
    private String env_name_magic_word;

    @GetMapping("/")
    public String test() {
        return "app working fine!";
    }

    @GetMapping("/appname")
    public String getRate() {
        return "App name is : " + appName;
    }

    @GetMapping("/magicword")
    public String getMagicWord() {
        return "magic word is : " + env_name_magic_word;
    }
}
