package com.nikhilSpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{

    @Autowired
    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;

    /*@Autowired
    public void doSomething(FortuneService fortuneService) {

        System.out.println("This is doSomething Autowired method");
        this.fortuneService = fortuneService;
    }*/

    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    */


    @Override
    public String getDailyWorkout() {
        return "This is TennisCoach Class";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}