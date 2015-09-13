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
