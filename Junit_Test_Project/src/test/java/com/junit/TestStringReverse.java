package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.junit.StringReverse;

public class TestStringReverse {
	

	
	@Test
	public void testString()
	{
		StringReverse sr = new StringReverse();
		String str1 = sr.reverse("Sam");
//		String str2 = "maS";
		assertEquals("maS", str1);
		

		
		
	}
}



