package Test;

import com.nikhilSpringDemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest
{

    public static void main(String[] args)
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("res/beanLifeCycle-applicationContext.xml");

        Coach theCoach = context.getBean("coach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }

}
