package org.hql.test;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hql.test.entity.Book;
import org.hql.test.utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=null;
    	Session session=null;
    	Transaction transaction=null;
    	try
    	{
        factory=HibernateUtility.getSessionFactory();
        session=factory.openSession();
        transaction=session.beginTransaction();
        
        
        Book b=new Book("C Programming","programming","Sam.B.Bhosale",1000.0,7824673);
       
        session.persist(b);
        
//        Query<Book> query=session.createQuery("from Book");
//        List<Book> books=query.list();
//        
//        
//        System.out.println(books.get(0));
        
       // Query<Book> query1=session.createQuery("from Book");
       // query1.setFirstResult(0);
       // query1.setMaxResults(3);
        
       // List<Book> result=query1.list();
        
        
        //for(Book b:result)
        //{
        //	System.out.println(b); 
       // }
        
        transaction.commit();
        
//        Criteria criteria=session.createCriteria(Book.class);
//        criteria.add(Restrictions.ge("price",new Double(400)));
//        List<Book> books=criteria.list();
//        for(Book b:books)
//        {
//            	System.out.println(b); 
//        }
//        
    	}
    	
    	catch(Exception e)
    	{
            transaction.rollback();
    		System.out.println(e.getMessage());
    	}
    	
    	finally
    	{
    		session.close();
    		factory.close();
    	}
    }
}
