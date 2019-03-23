package com.ara.programming.algo;

import java.util.HashMap;
import java.util.Map;

public class FindPalindrome {

	public static void main(String[] args) {
		String s = "sudhaahdus";
		int len = s.length();
		boolean oneOdd = false;
		Map<Character, Integer> map = new HashMap<>();
		// m = 2, n=1, a=2
		for (int i=0;i<len;i++) {
			char ch = s.charAt(i);
			// store each char into map; each char has weights/counts
			if (map.containsKey(ch)) {
				Integer value = map.get(ch);
				map.put(ch,value+1);
			} else {
				map.put(ch, 1);
			}
		}
		if (len%2==0) {
			// even length of string = all should be even
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				int eValue = entry.getValue();
				int res = eValue%2;
				if (res==0) {
					// OK
				} else {
					// cannot be
					System.out.println("cannot be");
					break;
				}
			}
		} else {
			// only 1 val can be odd;
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				int eValue = entry.getValue();
				int res = eValue%2;
				if (res==0) {
					// OK
				} else {
					// so this is odd
					if (oneOdd) {
						// already set 
						System.out.println("cannot be");
						break;
					} else {
						oneOdd = true;
					}
				}
			}
			System.out.println("can be..");
		}
		// if odd total, then permit only 1 to have odd
		// if even - all of them have to be even
	}

}
