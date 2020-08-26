package com.atguigu.providerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Royal on 2020/8/6
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${myName}")
    private String myName;

    @Value("${jdbcUrl}")
    private String jdbcUrl;

    @Value("${redisUrl}")
    private String redisUrl;

    @GetMapping("hello")
    public String hello() {
        return "hello" + myName+"============"+jdbcUrl+"==========="+redisUrl;
    }
}
