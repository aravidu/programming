package com.ara.programming.algo;

public class FindDigits {

	public static void main(String[] args) {
		int num = 1234;
		// 1234 = 1000 + 200 + 30 + 4 = 1000 + (100 + 100) + (10 + 10 + 10) + (5 - 1)
		// 1234/1000 = 1
		// 0,1,2,3,4,5,6,7,8,9
		// if number is 1-3, use I
		// if number is 5, use V
		// if number is 10, use X
		// if number in 10s place - use X
		// if number in 
		// I, V, X
		// 1 = ?+I		[]
		// 2 = ?+II		[][]
		// 3 = ?+III	[][][]
		// 4 = I+?		[][]
		// 5 = ?		[]
		// 6 = ?+I		[][]
		// 7 = ?+II		[][][]
		// 8 = ?+III	[][][][]
		// 9 = I+?		[][]

		String s = ""+num;
		int len = s.length();
		if (len == 1) {
			
		} else if (len == 2) {
			
		} else if (len == 3) {
			
		} else if (len == 4) {
			 
		}
//		for (int i=0;i<s.length();i++) {
//			if (len)
//		}
		System.out.println(num / 1000);
	}

}
