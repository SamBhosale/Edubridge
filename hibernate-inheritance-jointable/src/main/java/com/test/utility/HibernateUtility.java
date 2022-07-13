package com.test.utility;



import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.test.entity.CreditAccount;
import com.test.entity.DebitAccount;




public class HibernateUtility {
	
	private static SessionFactory factory=null;
	
	public static SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			try
			{
				
				Configuration configuration=new Configuration();
				
				Properties settings=new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/inheritance_join_table");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "root");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.FORMAT_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO, "update");
                
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(CreditAccount.class);
                configuration.addAnnotatedClass(DebitAccount.class);
                
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                  
                factory=configuration.buildSessionFactory(serviceRegistry);
                
              
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		 return factory;
	}

}
