package com.nikhilSpringDemo;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService
{

    @Override
    public String getFortune() {
        return "This is DataBaseFortuneService";
    }

}
