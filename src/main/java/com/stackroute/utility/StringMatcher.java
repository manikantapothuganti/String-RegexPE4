package com.stackroute.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
	public boolean stringMatcher(String string,String substring) {
		  Pattern pattern = Pattern.compile(substring,Pattern.CASE_INSENSITIVE); 
		  Matcher matcher = pattern.matcher(string);    
		
		return matcher.find();
	}

}
