package com.ara.programming.recursion;

public class RecursiveParenthesis {
	
	private static int n = 3;
	
	public static void main(String[] args) throws Exception {
		// ex P(3)
		// ()()()
		// (())()
		// ()(())
		// (()())
		// ((()))

		// b(nOpen:int, nClose:int, str:string)
		// b(n,n,"")
		// b(0,0,"")

		// b(nOpen += 1, nClose, str += "(")

		// (
		// / \
		// (( ()
		// / \ / \
		// ((( (() x ()(
		// / \ / \
		// ((() x (()) (()(
		// /
		// ((())
		// /
		// ((()))
		recursiveParenthesis(0, 0, 0, "");
	}

	public static void recursiveParenthesis(int open, int close, int balanced, String str) {
		
		// print when both open & close are same as n
		if (open == n && close == n) {
			System.out.println(str);
		}

		// when balanced (()), (), ()()
		if (balanced == 0 && open < n) {
			recursiveParenthesis(open += 1, close, balanced += 1, str += "(");
			return;
		}

		// open tree done = ((( or (()(; now close as many
		if (open == n && close < n) {
			recursiveParenthesis(open, close += 1, balanced -= 1, str += ")");
			// exit this recursive call when u are done with one tree
			return;
		}

		// open tree (((, (()(
		if (open < n) {
			recursiveParenthesis(open + 1, close, balanced + 1, str + "(");
		}

		// after ((())) --> ((, ((), (
		if (balanced != 0 && close < n) {
			recursiveParenthesis(open, close + 1, balanced - 1, str + ")");
		}
		
//		// this is a condition where we want to open the parenthesis
//		if (open < n) {
//			recursiveParenthesis(++open, close, str += "("); // 1, 0, (
//		}
//
//		// this is a condition where we want to close the parenthesis
//		if (close < open) {
//			recursiveParenthesis(open, ++close, str += ")"); // 0, 1, )	
//		}
	}
}
