package com_junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringTest {
	
	 @Test
	 public void testcase1() 
	 {
		 StringCompair ch=new StringCompair();
		 String str1="Sam";
		 String str2="Sam";
		 assertTrue(ch.StringValue(str1, str2));
//		 assertTrue(str1.equals(str2));
//		assertStringCompair(ch.arrayValue(str1, str2),str2);
		
	
	}
	 @Test
		public void testcase2()
		{
		 StringCompair ob=new StringCompair();
			String s1="Java Programming";
			String s2="java Programming";
			assertTrue(ob.equalStrings(s1, s2));
		}
	 
	 @Test
	 public void testCase3()
	 {
		 StringCompair sc = new StringCompair();
		 String str1="Sam";
		 String str2="Sam";
		 
		assertTrue(sc.stringEqual(str1,str2));
		
		 
	 }
	 



}
