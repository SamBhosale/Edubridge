package org.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	Resource resource= new ClassPathResource("applicationContext.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	System.out.println(factory.getBean("emp"));
    	System.out.println(factory.getBean("emp1"));

    }
}
