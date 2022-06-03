package com.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class TestConditionalExecutionsOS {
	    
	    @Test
	    @DisabledOnOs({OS.WINDOWS,OS.LINUX})
	    public void testcase1()
	    {
//	        AssertsCheckMethods a=new AssertsCheckMethods();
//	        
//	        assertNotNull(a.getApple("orange"));
//	        assertNull(a.getApple("apple"));
	        
	        
	    }
	    
	    @Test
	    @EnabledOnOs({OS.MAC,OS.SOLARIS})
	    public void testcase2()
	    {
//	        AssertsCheckMethods a=new AssertsCheckMethods();
//	        assertFalse(a.check(-10));
//	        assertTrue(a.check(10));
	    }
	    
	    @Test
	    @EnabledOnOs(OS.WINDOWS)
	    public void testcase3() {
	        AssertsCheckMethods a=new AssertsCheckMethods();
	        int ar[]= {21,23,33,25,27,90,56};
	        assertTrue(a.arrayElementsCheck(ar));
	    }

	}



