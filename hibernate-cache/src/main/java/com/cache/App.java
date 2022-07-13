package com.cache;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.cache.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().addAnnotatedClass(Student.class).configure("hibernate.cfg.xml");
        
        StandardServiceRegistryBuilder sb=new StandardServiceRegistryBuilder();
        sb.applySettings(cfg.getProperties());
        StandardServiceRegistry registery=sb.build();
        
        
       SessionFactory factory=cfg.buildSessionFactory(registery);
		
		  Session session1=factory.openSession(); Transaction
		  t1=session1.beginTransaction(); 
			
			  Student s=session1.get(Student.class, 134); 
			  System.out.println(s);
			  session1.close();
			  
			  Session session2=factory.openSession(); Transaction
			  t2=session2.beginTransaction(); 
			  Student s1=session2.get(Student.class, 134);
			  System.out.println(s1); session2.close();
			 
		 
		
			
//			 Student s=new Student(134,"Aman","Kolkata");
//			  
//			  session1.save(s);
//			  
//			  t1.commit();
			 
		 
    }
}
