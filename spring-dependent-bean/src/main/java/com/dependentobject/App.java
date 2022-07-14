package com.dependentobject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dependentobject.entity.Driver;

public class App 
{
    public static void main( String[] args )
    {

    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	Driver driver = (Driver) context.getBean("driver");
    	
    	System.out.println(driver.getDriverId());
    	System.out.println(driver.getDriverName());
    	System.out.println(driver.getDriverContact());
    	
    	
    	System.out.println(driver.getCar().getCarNo());
    	System.out.println(driver.getCar().getCarModel());
    	System.out.println(driver.getCar().getCarBrand());
    	System.out.println(driver.getCar().getCarType());
    	

    	Driver driver1 = (Driver) context.getBean("driver2");
    	
    	System.out.println(driver1.getDriverId());
    	System.out.println(driver1.getDriverName());
    	System.out.println(driver1.getDriverContact());
    	
    	
    	System.out.println(driver1.getCar().getCarNo());
    	System.out.println(driver1.getCar().getCarModel());
    	System.out.println(driver1.getCar().getCarBrand());
    	System.out.println(driver1.getCar().getCarType());

    	

    }
}
