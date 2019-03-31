package com.ara.programming.java;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Anagrams {

	// incomplete
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

        for (int i=0;i<a.length();i++) { // anagram
            char c = a.charAt(i);
            if (amap.containsKey(c)) {
                amap.put(c,amap.get(c)+1);
            } else {
                amap.put(c,1);
            }
        }

        for (int j=0;j<b.length();j++) { //margana
            Character c = b.charAt(j);
            if (bmap.containsKey(c)) {
                bmap.put(c,bmap.get(c)+1);
            } else {
                bmap.put(c,1);
            }
        }

        boolean anagrams = false;

        int i=0;
        int j=0;
//        for(Map.Entry<Character, Integer> ae : amap.entrySet())
//        {
//        	if(bmap.containsKey(ae.getKey()))
//        	{
//        		int val1 = bmap.get(ae.getKey());
//        		if(ae.getValue() != val1)
//        		{
//        			return false;
//        		}
//        		
//        	}
//        	else
//        	{
//        		return false;
//        	}
//        }
        for (Map.Entry<Character,Integer> ae : amap.entrySet()) {
            for (Map.Entry<Character,Integer> be : bmap.entrySet()) {
                if (i==j) {
                    if (ae.getValue() != be.getValue()) {
                        anagrams = false;
                        break;
                    }
                    anagrams = true;
                } else {
                    continue;
                }
                j++;
            }
            j=0;
            if (!anagrams) {
                break;
            }
            anagrams = true;
            i++;
        }
        
        System.out.println(anagrams ? "Anagrams": "Not Anagrams");

	}

}
