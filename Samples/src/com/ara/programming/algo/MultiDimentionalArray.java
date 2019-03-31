package com.ara.programming.algo;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		//int[][] matrix = new int[][] {{1,2},{3,4},{5,6}};
		//int[][] matrix = new int[][] {{1,0,0},{0,0,1}};
		int[][] matrix = new int[][] {{1,0}};
		for (int i=0;i<matrix.length;i++) {
			for (int j=matrix[i].length-1;j>=0;j--) {
				System.out.println(matrix[i][j]);	
			}
		}
	}

}
