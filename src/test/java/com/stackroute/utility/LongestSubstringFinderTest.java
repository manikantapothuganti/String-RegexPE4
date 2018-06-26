package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestSubstringFinderTest {

	@Test
	public void testLongestSubstring() {
		LongestSubstringFinder obj = new LongestSubstringFinder();
		String expected="abababaaaabababa";
		String actual=obj.longestSubstring("aabbccabababaaaabababacbabccbcbcb");
		assertEquals(expected, actual);
	}

}
