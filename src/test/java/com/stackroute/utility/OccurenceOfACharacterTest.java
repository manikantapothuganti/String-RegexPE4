package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class OccurenceOfACharacterTest {

	@Test
	public void testTotalOccurenceOfStirng() {
		OccurenceOfACharacter occurenceOfACharacter = new OccurenceOfACharacter();
		int expected=6;
		int actual =occurenceOfACharacter.totalOccurenceOfACharacter("java is java again java and java java then java","java"); 
		assertEquals(expected, actual);
	}

}
