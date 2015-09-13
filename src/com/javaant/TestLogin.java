package com.javaant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLogin {
	
	@Test
	public void testLoginCredentials(){
		MyLogin mlogin= new MyLogin();
		assertEquals(true,mlogin.login("javaant", "java"));		
	}
	@Test
	public void testLoginCredentials1(){
		MyLogin mlogin= new MyLogin();
		assertEquals(true,mlogin.login("java", "ant"));
		
	}
	
	@Test
	public void testLoginCredentials2(){
		MyLogin mlogin= new MyLogin();
		assertEquals(false,mlogin.login("javaant", "java"));
		
	}

}
