package com.ara.programming.arrays;

public class MaxSubArray {
	public static void main(String[] args) {
		int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		int max = nums[0];
        int sum = 0;
        // [-2,1,-3,4,-1,2,1,-5,4]
        for (int i=0;i<nums.length;i++) {
            System.out.println("i: "+i);
            int count = i+1;
            for (int j=i;j<count;j++) {
                System.out.println("j: "+j + ", count: "+count);
                for (int k=i;k<count;k++) {
                    System.out.println("k: "+k);
                    sum += nums[k];
                }
                System.out.println("sum after k: "+sum);
                if (sum > max) {
                    max = sum;
                }
                System.out.println("max after k: "+max);
                sum = 0;
                count++;
                if (j==nums.length-1) {
                    break;
                }
            }
        }
        System.out.println(max);
	}
}
