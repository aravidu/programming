package com.ara.programming.recursion;

public class RecursiveParenthesis2 {

	private static int n = 3;
	
	public static void main(String[] args) {
		char[] str = new char[2 * n];
		printParenthesis(str, n);
	}

	// Wrapper over _printParenthesis()
	static void printParenthesis(char str[], int n) {
		if (n > 0)
			printParenthesis(str, 0, n, 0, 0);
		return;
	}

	// Function that print all combinations of
	// balanced parentheses
	// open store the count of opening parenthesis
	// close store the count of closing parenthesis
	static void printParenthesis(char str[], int pos, int n, int open, int close) {
		if (close == n) {
			// print the possible combinations
			for (int i = 0; i < str.length; i++)
				System.out.print(str[i]);
			System.out.println();
			return;
		} else {
			if (open > close) {
				str[pos] = '}';
				printParenthesis(str, pos + 1, n, open, close + 1);
			}
			if (open < n) {
				str[pos] = '{';
				printParenthesis(str, pos + 1, n, open + 1, close);
			}
		}
	}

}
