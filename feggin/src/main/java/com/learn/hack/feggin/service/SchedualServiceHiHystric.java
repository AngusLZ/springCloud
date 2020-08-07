package com.learn.hack.feggin.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHi(String name) {
        return "sorry" + name;
    }
}
