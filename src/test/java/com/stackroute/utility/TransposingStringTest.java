package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransposingStringTest {

	@Test
	public void testTransposeString() {
		TransposingString ts = new TransposingString();
		String expected ="a kciuq nworb xof spmuj revo eht yzal god";
		String actual = ts.transposeString("a quick brown fox jumps over the lazy dog");
		assertEquals(expected, actual);
	}

}
