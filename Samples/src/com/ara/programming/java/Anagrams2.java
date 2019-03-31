package com.ara.programming.java;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Anagrams2 {

	public static void main(String[] args) {
		Map<Character,Integer> amap = new TreeMap<>();
        Map<Character,Integer> bmap = new TreeMap<>();
        
        String a = "anagramm";
        String b = "marganaa";
        
        int alen = a.length();
        int blen = b.length();

        if (!((1<=alen && alen<=50) || (1<=blen && blen<=50) || (alen==blen))) {
            System.exit(1);
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aarr = a.toCharArray();
        char[] barr = a.toCharArray();
        
        
        
        //System.out.println(anagrams ? "Anagrams": "Not Anagrams");

	}

}
