package com.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.junit.SimpleInterest;

public class TestSimpleInterest {
	
	@Test
	public void testcase()
	{
		SimpleInterest si = new  SimpleInterest();
		double result = si.calculate(12000,7,2);
		assertEquals(1680, result);
		
	}

}
