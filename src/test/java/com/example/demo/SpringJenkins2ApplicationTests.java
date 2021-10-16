package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkins2ApplicationTests {

	public static org.slf4j.Logger Logger=LoggerFactory.getLogger(SpringJenkins2ApplicationTests.class);
	@Test
	void contextLoads() {
		Logger.info("Test case executing");
		assertEquals(true,true);
	}

}
