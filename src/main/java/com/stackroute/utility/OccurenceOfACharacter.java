package com.stackroute.utility;

public class OccurenceOfACharacter {
	public int totalOccurenceOfACharacter(String string,String substring) {
		int actual_length= string.length();
		String replacedString = string.toLowerCase().replaceAll(substring.toLowerCase(),"");
		int replaced_length = replacedString.length();
		int count = (actual_length-replaced_length)/substring.length();
		return count;
		}


}
