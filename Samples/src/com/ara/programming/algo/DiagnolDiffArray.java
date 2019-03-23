package com.ara.programming.algo;

public class DiagnolDiffArray {

	public static void main(String[] args) {
		int arr[][] = {{11, 2, 4},{4,5,6},{10, 8, -12}};
		//int arr[][] = {{1,2},{3,4}};
		int ps = 0;
        int ss = 0;
        int rcount = 1;
        int ccount = arr.length;
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                if (!(-100<=arr[i][j] && arr[i][j]<=100)) {
                	continue;
                }
                if ((i==j)) {
                    ps += arr[i][j];
                }
                if (j==(ccount-1) && i==(rcount-1)) {
                    ss += arr[i][j];
                    ccount--;
                }
            }
            rcount++;
        }
        System.out.println(ps);
        System.out.println(ss);
        System.out.println(Math.abs(ps-ss));
	}

}
