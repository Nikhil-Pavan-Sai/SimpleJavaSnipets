package com.nikhilSpringDemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService
{

    @Override
    public String getFortune()
    {

        return "Hey there ! This is RandomService";

    }

}
