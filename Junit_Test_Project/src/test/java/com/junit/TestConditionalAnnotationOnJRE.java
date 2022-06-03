package com.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import com.junit.AssertCheckMethods;

public class TestConditionalAnnotationOnJRE {

	
	@Test
    @EnabledOnJre({JRE.JAVA_9,JRE.JAVA_10,JRE.JAVA_11})
    public void testcase1()
    {
        AssertCheckMethods a=new AssertCheckMethods();
        
        assertNotNull(a.getApple("orange"));
        assertNull(a.getApple("apple"));        
    }
    
    @Test
    @DisabledOnJre(JRE.JAVA_8)
    public void testcase2()
    {
        AssertCheckMethods a=new AssertCheckMethods();
        assertFalse(a.check(-10));
        assertTrue(a.check(10));
    }
    
    @Test
    public void testcase3() {
        AssertCheckMethods a=new AssertCheckMethods();
        int ar[]= {21,23,33,25,27,90,56};
        assertTrue(a.arrayElementsCheck(ar));
    }

}
