package com.ara.programming.algo;

public class PassByValueCheck {

	public static void main(String[] args) {
		//int num = 1;
//		System.out.println("before increment: "+num);
//		incrementNum(num);
//		System.out.println("after increment: "+num);
//		changeNum(num);
//		System.out.println("after change: "+num);
//		
		Integer numObj = new Integer(5);
		incrementNum(numObj);
		System.out.println("after increment: "+numObj.intValue());
	}
	
	private static void incrementNum(int num) {
		System.out.println("inside increment.. "+num);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println("exiting increment..");
	}
	private static void changeNum(int num) {
		num = num+1;
	}

}
