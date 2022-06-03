package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import com.junit.CheckValue;


public class TestArray {
	
	 @Disabled
	 @Test
	 @DisplayName("Element")
	 public void testcase1() 
	 {
		 CheckValue ch=new CheckValue();

			int ar[]= {10,43,655,23,545,54};
		
			assertTrue(ch.arrayValue(ar));
	  
	}
	 
	 @RepeatedTest(3)
	 @DisplayName("Check Array Null")
	public void testcase2()
	{
		CheckValue ch = new CheckValue();
		int arr[]=null;
		assertNotNull(ch.arrayCheck(arr));
		assertNull(ch.arrayCheck(arr));
	}


}
