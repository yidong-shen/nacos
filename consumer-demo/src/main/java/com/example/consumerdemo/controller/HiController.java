package com.example.consumerdemo.controller;

import com.example.consumerdemo.fegin.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Royal on 2020/8/6
 */
@RestController
public class HiController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("hi")
    public String hi(HttpServletRequest request) {

        String hello= this.providerClient.hello();
        return "hi consumer，============"+hello+"========="+ request.getServerPort();
    }
}
