package com.stackroute.utility;

public class ReplacingCharacter {
	public String replacingCharacter(String string) {
		String replacedStringDWithF = string.replaceAll("d|D","f");
		String replacedStringLWithT = replacedStringDWithF.replaceAll("l|L", "t");
		return replacedStringLWithT;
		
	}

}
