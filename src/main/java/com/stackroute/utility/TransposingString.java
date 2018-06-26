package com.stackroute.utility;

public class TransposingString {
	public String transposeString(String string) {
		String transposedString="";
		String array[]= string.trim().split(" ");
		for(int i=0;i<array.length;i++) {
			String reverse="";
			for(int j=array[i].length()-1;j>=0;j--){
				reverse=reverse+array[i].charAt(j);
			}
			transposedString=transposedString+" "+reverse;
		}
		return transposedString.trim();
	}
}
