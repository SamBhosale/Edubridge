package com.junit;

public class StringReverse {
	
	
	public  String reverse(String input) {

	    if (input == null) {
	        return input;
	    }

	    String output = "";

	    for (int i = input.length() - 1; i >= 0; i--) {
	        output = output + input.charAt(i);
	    }

	    return output;
	}

	}



