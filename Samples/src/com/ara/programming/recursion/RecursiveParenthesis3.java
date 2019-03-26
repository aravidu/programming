package com.ara.programming.recursion;

public class RecursiveParenthesis3 {

	public static void main(String[] args) {

		int n = 3;

		recursiveParenthesis(n, "", 0, 0, 0);

	}

	public static void recursiveParenthesis(int n, String str, int balanced, int open, int close) {

		if (open == n && close == n) {
			System.out.println(str);
		}

		if (balanced == 0 && open < n) {
			recursiveParenthesis(n, str += "(", balanced += 1, open += 1, close);
			return;
		}

		if (open == n && close < n) {
			recursiveParenthesis(n, str += ")", balanced -= 1, open, close += 1);
			return;
		}

		if (open < n)
			recursiveParenthesis(n, str + "(", balanced + 1, open + 1, close);

		if (balanced != 0 && close < n)
			recursiveParenthesis(n, str + ")", balanced - 1, open, close + 1);
	}
}
