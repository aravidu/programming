package com.ara.programming.algo;

public class BigSumArray {
	public static void main(String[] args) {
		int[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		long sum = 0;
        for (long i: ar) {
            if (!(1<=i && i<=(Math.pow(10, 10)))) {
                break;
            }
            sum+=i;
        }
        System.out.println(Math.pow(10, 10));
		System.out.println(sum);
	}
}