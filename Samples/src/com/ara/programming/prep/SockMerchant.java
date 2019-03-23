package com.ara.programming.prep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SockMerchant {

	public static void main(String[] args) {
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int len = ar.length;
        if (!(1<=len && len<=100)) {
            System.exit(1);
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Map<Integer,Double> pairsmap = new HashMap<Integer,Double>();
        int pairs = 0;
        //10 20 20 10 10 30 50 10 20
        for (int i=0;i<len;i++) {
            int arval = ar[i];
            if (!(1<=arval && arval<=100)) {
                System.exit(1);
            }
            if (map.containsKey(arval)) {
                int mapval = map.get(arval);
                int pairval = mapval+1;
                map.put(arval,pairval);
                double divval = pairval/2.0;
                pairsmap.put(arval,divval);
            } else {
                map.put(arval,1);
                pairsmap.put(arval,0.0);
            }
        }
        Set<Map.Entry<Integer,Double>> set = pairsmap.entrySet();
        for (Map.Entry<Integer, Double> entry : set) {
            pairs+=entry.getValue();
        }
        System.out.println(pairs);

	}

}
