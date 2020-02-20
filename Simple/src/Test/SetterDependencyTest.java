package Test;

import com.nikhilSpringDemo.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDependencyTest
{

    public static void main(String[] args)
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("res/applicationContext.xml");

        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam());

        context.close();

    }

}
