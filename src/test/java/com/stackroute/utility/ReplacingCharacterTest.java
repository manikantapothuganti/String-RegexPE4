package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplacingCharacterTest {

	@Test
	public void testReplacingCharacter() {
		String expected="faity fry";
		ReplacingCharacter replacingchar = new ReplacingCharacter();
		String actual = replacingchar.replacingCharacter("daily dry");
		assertEquals(expected, actual);
	}

}
