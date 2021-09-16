package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testShow()
	{
		MyApp m=new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello Maven",s);
	}
	@Test
	void testAdd()
	{
		int r=Calculator.add(100, 400);
		Assertions.assertEquals(500, r);
		Assertions.assertEquals(300, Calculator.add(100, 200));
		Assertions.assertNotEquals(900, r);
		
	}
	@Test
	void testAssertFalse()
	{
		Assertions.assertFalse("Priya".length()==10);
	}
	@Test
	void testAssertAll()
	{
		String s1="abc";
		String s2="xyz";
//		Assertions.assertAll(
//				()->Assertions.assertEquals(s1, "abc"),
//				()->Assertions.assertEquals(s2, "xyz")
//				);
//					
	}
	
	
	

}
