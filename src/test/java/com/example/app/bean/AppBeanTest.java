package com.example.app.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class AppBeanTest {
	
	
	AppBean bean=new AppBean();

	@Test
	void testAppBean() {
		assertTrue(true);
	}

	@Test
	void testGetName() {
		bean.setName("test");
		assertEquals("test",bean.getName());
	}

	@Test
	void testSetName() {
		bean.setName("test");
		assertEquals("test",bean.getName());
	}

	@Test
	void testGetValue() {
		bean.setValue("test");
		assertEquals("test",bean.getValue());
	}

	@Test
	void testSetValue() {
		bean.setValue("test");
		assertEquals("test",bean.getValue());
	}

}
