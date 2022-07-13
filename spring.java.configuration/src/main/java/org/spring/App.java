package org.spring;



import org.spring.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        
//    	if Bean name not given then it use bean name as method name
//        System.out.println(context.getBean("book"));
//        System.out.println(context.getBean("configBookByProperty"));
        
        System.out.println(context.getBean("book1"));
        System.out.println(context.getBean("book2"));
    }
}
