package com.example.consumerdemo.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Royal on 2020/8/11
 */
@FeignClient("service-provider")
public interface ProviderClient {

    @GetMapping("hello")
    public String hello();
}
