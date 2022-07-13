package org.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource= new ClassPathResource("context.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	System.out.println(factory.getBean("book1"));
    	System.out.println(factory.getBean("book2"));
    }
}
