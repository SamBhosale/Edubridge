package com.spring;




import com.spring.entity.QuestionInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
       
     //getting the bean from IOC container
       QuestionInfo q1=(QuestionInfo) context.getBean("question1");
       QuestionInfo q2=(QuestionInfo) context.getBean("question2");
       
       
      System.out.println(q1);
      System.out.println(q2);  
    }
}
