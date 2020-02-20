package Test;

import com.nikhilSpringDemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDependencyTest
{

    public static void main(String[] args)
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("res/applicationContext.xml");

        Coach myCoach = context.getBean("coach", Coach.class);

        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());

        context.close();

    }

}
