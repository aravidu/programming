package com.ara.programming.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCandles {

	public static void main(String[] args) {
		int[] ar = {3, 2, 1, 3};
		if (!(1<=ar.length && ar.length<=Math.pow(10,5))) {
            System.exit(1);
        }
        
        List<Integer> list = new ArrayList<>(ar.length);
        for (int i=0;i<ar.length;i++) {
            if (!(1<=ar[i] && ar[i]<=Math.pow(10,7))) {
                System.exit(1);
            }
            list.add(ar[i]);
        }
        int len = list.size();
        Collections.sort(list);

        Map<Integer,Integer> map = new HashMap<>();
        for (Integer item : list) {
        	if (map.containsKey(item)) {
                Integer val = map.get(item);
                map.put(item,val+1);
            } else {
                map.put(item,1);
            }
        }
        Integer val = map.get(list.get(len-1));
        System.out.println(val);

	}

}
