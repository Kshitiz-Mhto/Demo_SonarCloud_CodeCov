package com.testcoverage.code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeApplicationTests {

	Rev reverseString = new Rev();

	@Test
	void testRevString(){
		assertEquals("pot", reverseString.revString("top"));
	}
}
