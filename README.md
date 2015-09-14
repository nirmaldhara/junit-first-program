# junit-first-program

#How to setup Junit in eclipse?
Junit can be setup for eclipse , Netbean indeed for any IDE. we need only junit jar and hammcrest jar in class path.

#How Junit Works?
Call the business method get the result, compare the result with expected result. If actual result match with expected result then test is pass else fail.

#Example
Suppose we have a method which is responsible for user authentication. we need to pass user id and password if user id and password is correct then method return true else false.
##Step 1
Write a method with @Test annotation.
##Step 2
call the method which is responsible for user authentication and get the response.
##Step 3
Now compare the expected result with actual result.
##Step 4
Check the result.

###MyLogin.java

```java
package com.javaant;

import java.util.Scanner;

public class MyLogin {

	
	public boolean login(String userid,String password){
		
		if(userid=="java" && password=="ant"){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String userid=scan.next();
		String password=scan.next();
		MyLogin jt=new MyLogin();
		jt.login(userid,password);
	}

}
```

###TestLogin.java

```java
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
```
