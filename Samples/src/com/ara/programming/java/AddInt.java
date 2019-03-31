package com.ara.programming.java;

import java.util.ArrayList;
import java.util.List;

import com.ara.programming.lambda.StringStream;

public class AddInt {

	public static void main(String[] args) {
		int x = 1534236469;
		String str = "" + x; // 1534236469
		String strWOSign = "";
		boolean sign = false;

		// check sign
		if ("-".equals(str.substring(0, 1))) {
			strWOSign = str.substring(1);// 123
			sign = true;
		} else {
			strWOSign = str;// 1534236469
		}

		String temp = strWOSign;// 1534236469
								// 2147483648
		// check 0 - truncate all trailing zeros
		while (true) { // 0
			int templen = temp.length();// 0,1
			String zero = temp.substring(templen - 1, templen);
			if ("0".equals(zero)) {
				if (templen != 1) {
					temp = temp.substring(0, templen - 1);// 12
					continue;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		// no leading zero concern
		// temp=12
		strWOSign = temp;// 1534236469

		String reverse = "";
		int len = strWOSign.length(); // can overflow,3
		for (int i = len - 1; i >= 0; i--) {
			// 12000
			reverse += strWOSign.charAt(i);
		}
		// reverse = 021;

		int ret = Integer.parseInt(reverse);
		// check sign
		if (sign) {
			ret = -ret;
		}
	}

}
