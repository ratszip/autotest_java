package com.cpc.Util;

import static org.junit.Assert.assertEquals;

import io.github.artsok.RepeatedIfExceptionsTest;

public class Testfail {
	int i=0;
	@RepeatedIfExceptionsTest(repeats =4,minSuccess=1)
	public void retry() {
		
		assertEquals(i++, 4);
	}
}
