package Test;

import com.nikhilSpringDemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest
{

    public static void main(String[] args)
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("res/beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("coach", Coach.class);

        Coach thealphaCoach = context.getBean("coach", Coach.class);

        System.out.println("Result: " + (theCoach == thealphaCoach));

        System.out.println("Memory Loc theCoach" + theCoach);

        System.out.println("Memory Loc theAlphaCoach" + thealphaCoach);

        context.close();

    }

}
