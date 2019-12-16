package com.ara.programming.arrays;

public class FlipHorizontalMatrix {
	public static void main(String[] args) {
	    // {{1,0,0},{0,0,1}}
		// {{1,1},
		//  {0,0}}
		int[][] matrix = new int[2][2];
//		for (int i=0;i<matrix.length;i++) {
//			for (int j=0;j<matrix[i].length;j++) {
//				matrix[i][j] = 0;
//			}
//		}
		matrix[0][0] = 1;
		matrix[0][1] = 1;
		matrix[1][0] = 0;
		matrix[1][1] = 0;
		
	    int j=matrix.length-1;
	    for (int i=0;i<matrix.length/2;i++) {
	        int[] temp = matrix[i];
	        matrix[i] = matrix[j];
	        matrix[j] = temp;
	        j--;
	    }
	}
}
