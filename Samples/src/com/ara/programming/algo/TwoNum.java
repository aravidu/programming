package com.ara.programming.algo;

public class TwoNum {

	public static void main(String[] args) {
		int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] retarray = new int[2];
		int c1 = 0;
        for (int i : nums) {
            int c2 = 0;
            for (int j : nums) {
                if (i==j) {
                    continue;
                }
                if (i+j == target) {
                    retarray[0] = c1;
                    retarray[1] = c2;
                }
                c2++;
            }
            c1++;
        }
        
        System.out.println(retarray[0] + ", "+retarray[1]);

	}

}
