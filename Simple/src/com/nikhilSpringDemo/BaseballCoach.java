package com.nikhilSpringDemo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService)
    {

        fortuneService = theFortuneService;

    }

    public BaseballCoach() {}

    @Override
    public String getDailyWorkout()
    {

        return "This is BaseballCoach Class";

    }

    @Override
    public String getDailyFortune()
    {

        return fortuneService.getFortune();

    }

}