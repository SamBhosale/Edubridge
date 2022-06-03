package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.Factorial;
import com.junit.Sorting;

public class Test_Test_Cases {
	
	@Test   //annotation
	public void testcase1()
	{
		Factorial f=new Factorial();
		long actualOutput=f.factorial(5);
		long expectedOutput=120;
		assertEquals(expectedOutput, actualOutput);
		
		
	}
	
	@Test
	public void testcase2()
	{
		Factorial f=new Factorial();
		long actualOutput=f.factorial(0);
		long expectedOutput=1;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	@Timeout(value=-1,unit=TimeUnit.SECONDS)
	public void bubbleSortingTest()
	{   

//		Logger logger=Logger.getLogger(Check_Test_Case.class.getName());
		Sorting s=new Sorting();
		int ar[]= {12,78,1,90,4,1,55,88,89,456};
		int actualArray[]=s.bubbleSort(ar);
//		logger.info(Arrays.toString(actualArray));
		int expectedArray[]= {1,1,4,12,55,78,88,89,90,456};
		assertArrayEquals(expectedArray, actualArray);
	}

}


