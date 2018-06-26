package com.stackroute.utility;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortingText {
	public String sortWordsOfText(String userInput) {
		String sortedText="";
		    String[] words = userInput.split(" ");
		    Arrays.sort(words);
		    for (int i=0;i<words.length;i++)
		    {
		    	sortedText= sortedText.concat(words[i].concat(" "));
		    }
		    System.out.println(sortedText);
		    return sortedText.trim();
	}
		
}
