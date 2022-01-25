package com.sea.service.feign.service;


import org.springframework.stereotype.Service;

@Service
public class FeignServiceHiHystric implements FeignService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }

}
