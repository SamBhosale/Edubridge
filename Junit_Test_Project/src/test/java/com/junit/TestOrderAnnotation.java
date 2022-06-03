package com.junit;

import java.lang.System.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.platform.commons.logging.LoggerFactory;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest

public class TestOrderAnnotation {
	
	 @Order(3)
	    @Test
	    @DisplayName("String Comparision")
	    public void testcase1()
	    {
		 
		    private static final Logger log = LoggerFactory.getLogger(TestOrderAnnotation.class);
	        log.info("Junit - Order 1");

	       
	        
	        
	    }
	    
	    @Order(2)
	    @Test
	    @DisplayName("Number Checking ")
	    @EnabledOnJre(JRE.JAVA_9)
	    public void testCheck()
	    {
	        AssertsCheckMethods a=new AssertsCheckMethods();
	        assertFalse(a.check(-10));
	        assertTrue(a.check(10));
	    }
	    
	    @Order(4)
	    @RepeatedTest(2)
	    @DisplayName("Addition Method Test")
	    @EnabledOnOs({OS.LINUX,OS.MAC} )
	    @DisabledOnJre(JRE.JAVA_14)
	    public void testEquality()
	    {
	        AssertsCheckMethods a=new AssertsCheckMethods();
	        assertEquals(10,a.addition(5, 5));
	        assertNotEquals(20, a.addition(5, 10));
	    }
	    
	    @Order(1)
	    @RepeatedTest(3)
	    @DisplayName("Array checking")
	    @DisabledOnOs({OS.WINDOWS,OS.SOLARIS})
	    public void testArray() {
	        AssertsCheckMethods a=new AssertsCheckMethods();
	        int ar[]= {21,23,33,25,27,90,56};
	        assertTrue(a.arrayElementsCheck(ar));
	    }
	    

}



