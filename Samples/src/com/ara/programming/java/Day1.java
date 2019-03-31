package com.ara.programming.java;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        int j = Integer.parseInt(scan.next());
        double k = Double.parseDouble(scan.next());
        String t = "";
        while (scan.nextLine() != null) {
            t+=scan.nextLine();
        }
        scan.close();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+j);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+k);
        System.out.println(s+t);
        
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

	}
}
