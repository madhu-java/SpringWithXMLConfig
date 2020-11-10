package org.madhu.SpringMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Car obj = new Car();
       // Bike obj=new Bike();
    	//Vehicle obj = new Bike();
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    
    	Vehicle obj = (Vehicle) context.getBean("vehicle");
       obj.drive();
    }
}
