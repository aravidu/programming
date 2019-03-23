package com.ara.programming.java;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {

	public static void main(String[] args) {
		String A = "java";
		int len = A.length();

        if (!((1<=len && len<=50))) {
            System.exit(1);
        }

        for (int i=0;i<A.length();i++) {
            char c = A.charAt(i);
            if (!(97<=c && c<=122)) {
                System.exit(1);
            }
        }

        boolean even = false;
        boolean eligible = false;

        if (len%2 == 0) {
            even = true;
        }

        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<len;i++) { // madam
            char c = A.charAt(i); //m
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c,val+1);
            } else {
                map.put(c,1); //m-2,a-2,d-1
            }
        }

        // if even length
        if (even) {
            int count=0;
            for (Map.Entry<Character,Integer> e : map.entrySet()) {//a-2,j-1,v-1
                Integer val = e.getValue();
                if (val%2 != 0) {
                	eligible=false;
                    break;
                }
                eligible=true;                
            }
        }
        
        // if odd length and has more than 1 char as odd? 
        if (!even) {
            int count=0;
            for (Map.Entry<Character,Integer> e : map.entrySet()) {//m-2,a-2,d-1
                Character key = e.getKey();
                Integer val = e.getValue();
                if (val%2 != 0) {
                count++;
                }
                if (count>1) {
                    break;
                }
                eligible=true;
            }
        }

        if (eligible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

	}

}
