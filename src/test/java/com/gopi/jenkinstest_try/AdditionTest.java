package com.gopi.jenkinstest_try;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void testSum() {
		Addition obj = new Addition();
		assertEquals(10, obj.sum(5, 5));
	}

}
