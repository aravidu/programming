package com.ara.programming.algo;

public class Staircase {
	public static void main(String[] args) {
		int n=6;
		int rcount = 1;
        int ccount = n;
        String rows = "";
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (j<(ccount-1)) {
                    rows=rows+" ";
                } else {
                    rows += "#";
                }
                ccount++;
            }
            System.out.println(rows);
        }
	}
}
