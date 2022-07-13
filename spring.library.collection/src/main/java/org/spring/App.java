package org.spring;



import org.spring.entity.Library;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class App 
{
    public static void main( String[] args )
    {
    	
    	 
    	  ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
          
    	  Library g=(Library) context.getBean("library1");
          
          System.out.println(g.getLibraryId());
          System.out.println(g.getLibraryName());
          for(String library:g.getLibraryEntry())
          {
       	   System.out.println(library);
          }
          
          
          ApplicationContext context1=new ClassPathXmlApplicationContext("context.xml");
          
    	  Library l=(Library) context1.getBean("library2");
          
          System.out.println(l.getLibraryId());
          System.out.println(l.getLibraryName());
          for(String library:l.getLibraryEntry())
          {
       	   System.out.println(library);
          }
          
          
//          ApplicationContext context3 = new FileSystemXmlApplicationContext("");
         
          
    }
}
