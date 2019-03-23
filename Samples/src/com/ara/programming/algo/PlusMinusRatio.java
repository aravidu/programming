package com.ara.programming.algo;

public class PlusMinusRatio {
	public static void main(String[] args) {
		int[] arr = {-4, 3, -9, 0, 4, 1};
        int cminus = 0;
        int cplus = 0;
        int czero = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]<0) {
                cminus++;
            } else if (arr[i]>0) {
                cplus++;
            } else {
                czero++;
            }
        }
        System.out.println(cplus+","+cminus+","+czero);
        double pd = cplus;
        System.out.println(pd);
        double len = arr.length;
        System.out.println(len);
        double val = pd / len;
        System.out.println(val);
        System.out.printf("%.6f", val);
	}
}
