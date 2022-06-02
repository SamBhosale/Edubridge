package com_junit;

public class StringCompair {
	


	public boolean StringValue(String str1,String str2)
	{
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0; j< str2.length();j++)
			{
				if(str1==str2)
				{
					return true;
				
					
				}
				else
				{
					return false;
				}
			}
			
			
	}
		return false;

}
	

	public boolean equalStrings(String st1,String st2)
	{
		if(st1.equals(st2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public boolean stringEqual(String str1, String str2)
	{
		if(str1==str2)
		{
			return true;
		}
		return false;
		
	}
}


