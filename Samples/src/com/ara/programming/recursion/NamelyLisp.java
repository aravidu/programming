package com.ara.programming.recursion;

public class NamelyLisp {

	public static void main(String[] args) {
		            //012345678910
		//String str = "( * 1 2 3 )";
		//String str = "( * 10 2 )";
		String str = "( + 1 2 ( * 3 ( + 4 5 ) 6 ) 7 )";
		//
		System.out.println(evalExpr(str));
	}
	
	public static int evalExpr(String str) {
		int sum = 0;
		int mul = 1;
		
		// base case
		if (str.indexOf("(") == -1) {
			// only expression
			boolean add = false;
			String[] strArray = str.split(" ");
			for (int i=0;i<strArray.length;i++) {
				if ("+".equals(""+strArray[i])) {
					add = true;
					continue;
				} else if ("*".equals(""+strArray[i])) {
					continue;
				}
				int val = Integer.parseInt(strArray[i]);
				if (add) {
					sum += val;
				} else {
					mul *= val;
				}
			}
			return add ? sum : mul;
		}
		
		// capture values outside of parenthesis
		// strip parenthesis and recursion inner
		return evalExpr(str.substring(2, 9));
	}

}
