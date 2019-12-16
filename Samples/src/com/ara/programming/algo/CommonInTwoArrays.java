package com.ara.programming.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommonInTwoArrays {

	public static void main(String[] args) {
		int[] sorta = new int[] {1,3,4,5,8,9,10};
		int[] sortb = new int[] {3,4,5,6,7};
		
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		for (int i=0;i<sorta.length;i++) {
//			if (map.containsKey(sorta[i])) {
//				int val = map.get(sorta[i]);
//				map.put(sorta[i],1+val);
//			} else {
//				map.put(sorta[i],1);
//			}
//		}
//		
//		for (int i=0;i<sortb.length;i++) {
//			if (map.containsKey(sortb[i])) {
//				int val = map.get(sortb[i]);
//				map.put(sortb[i],1+val);
//			} else {
//				map.put(sortb[i],1);
//			}
//		}
//		
//		List<Integer> list = new ArrayList<Integer>();
//		Set<Map.Entry<Integer,Integer>> set = map.entrySet();
//		for (Map.Entry<Integer, Integer> entry : set) {
//			if (entry.getValue() > 1) {
//				list.add(entry.getKey());
//			}
//		}
//		
//		list.stream().forEach(System.out::println);
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<sorta.length;i++) {
			for (int j=0;j<sortb.length;j++) {
				if (sorta[i] == sortb[j]) {
					list.add(sorta[i]);
				}	
			}
		}
		
		list.stream().forEach(System.out::println);
	}

}
