package com.junit;

public class AssertCheckMethods {
	
	public class AssertsCheckMethods {

		public Object getApple(String st)
		{
			if(st.equals("apple"))
			{
				return null;
			}
			else
			{
				return new Object();
			}
		}
		
		
		public boolean check(int a)
		{
			if(a>=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public long addition(long a,long b)
		{
			return a+b;
		}
		
		public boolean arrayElementsCheck(int ar[])
		{
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]<20)
				{
					return false;
					
				}
							
			}
			return true;
				
		}
	}




}
