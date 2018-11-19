package com.whb.web.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhbTest {
	
	Logger logger = LoggerFactory.getLogger(WhbTest.class);


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		logger.info("2222222");
		logger.debug("5555555");
	}

}
