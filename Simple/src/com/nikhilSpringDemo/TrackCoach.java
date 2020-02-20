package com.nikhilSpringDemo;

public class TrackCoach implements Coach
{

    private FortuneService fortuneService;

    TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public TrackCoach() {}


    @Override
    public String getDailyWorkout()
    {

        return "This is TrackCoach Class";

    }

    @Override
    public String getDailyFortune()
    {

        return fortuneService.getFortune();

    }

    //add init method
    public void doMyStartUpStuff()
    {

        System.out.println("Inside init method");

    }

    //add destroy method
    public void doMyCleanUpStuff()
    {

        System.out.println("Inside destroy method");

    }

}