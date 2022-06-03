package com.junit;

public class CheckValue {
	
	
		public boolean arrayValue(int ar[])
		{
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]<20)
				{
					return true;
				
					
				}
				else
				{
					return false;
				}
				
		}
			return false;

	}
		
		public boolean arrayCheck(int arr[])
		{
			if(arr==null)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

}
