package Test;

import com.nikhilSpringDemo.BaseballCoach;
import com.nikhilSpringDemo.Coach;
import com.nikhilSpringDemo.TrackCoach;

public class MyApp
{

    public static void main(String[] args)
    {

        Coach coach = new TrackCoach();

        System.out.println(coach.getDailyWorkout());

        Coach myCoach = new BaseballCoach();

        System.out.println(myCoach.getDailyWorkout());

    }

}