package com_junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Annotation {
	
	    
	    @BeforeAll
	    public static void beforeAll()
	    {
	        System.out.println("Before all method");
	    }
	    
	    
	    @BeforeEach
	    public void beforeEach()
	    {
	        System.out.println("Before each method");
	    }
	    
	    
	    
	    
	    @Test
	    public void testcase1() {
	        
            System.out.println("Test");

//	        SimpleInterest ob=new SimpleInterest();
//	        double result=ob.calculation(12000, 7, 2);
//	        assertEquals(1680, result);
	        
	    }
	    
	    @AfterEach
	    public void afterEach()
	    {
	        
	            System.out.println("After each method");

	    }
	    
	    @AfterAll
	    public static void afterAll()
	    {
	        System.out.println("after all method");

	    }

	}


