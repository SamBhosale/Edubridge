package com.test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.entity.CreditAccount;
import com.test.entity.DebitAccount;
import com.test.utility.HibernateUtility;



public class App 
{
    public static void main( String[] args )
    {
    	try {
			SessionFactory factory = HibernateUtility.getSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			DebitAccount daccount=new DebitAccount();
			daccount.setId(987663L);
			daccount.setOwner("Nilesh");
			daccount.setBalance(new BigDecimal(10000.0));
			daccount.setInterestRate(new BigDecimal(5.0));
			daccount.setOverdraftFee(new BigDecimal(2000.0));
			
			session.save(daccount);
			
			
			CreditAccount caccount=new CreditAccount();
			caccount.setId(987663L);
			caccount.setOwner("Nilesh");
			caccount.setBalance(new BigDecimal(10000.0));
			caccount.setInterestRate(new BigDecimal(5.0));
			caccount.setCreditLimit(new BigDecimal(20000.0));
			
			session.save(caccount);
			
			
			transaction.commit();


			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
