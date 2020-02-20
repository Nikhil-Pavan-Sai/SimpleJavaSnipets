package com.nikhilSpringDemo;

public class CricketCoach implements Coach
{

    private FortuneService fortuneService;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    private String emailAddress;
    private String team;


    public void setEmailAddress(String emailAddress)
    {

        System.out.println("Inside email setter method - CricketCoach");
        this.emailAddress = emailAddress;

    }

    public void setTeam(String team)
    {

        System.out.println("Inside team setter method - CricketCoach");
        this.team = team;

    }


    public CricketCoach()
    {

        System.out.println("CricketCoach: inside no-arg constructor");

    }

    @Override
    public String getDailyWorkout()
    {

        return "Practice fast bowling for 15 minutes";

    }

    @Override
    public String getDailyFortune()
    {

        return fortuneService.getFortune();

    }

    //Our Setter Method
    public void setFortuneService(FortuneService fortuneService)
    {

        System.out.println("Inside setter method - CricketCoach");
        this.fortuneService = fortuneService;

    }

}
