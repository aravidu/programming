package com.ara.programming.java;

public class SortString {

	public static void main(String[] args) {
		String words = "is2 Thi1s T4est 3a";
		if ("".equals(words)) {
			System.exit(1);
		}

		// get a string array = {is2, Thi1s, T4est, 3a}
		String[] strArray = words.split(" ");
		String[] sortedArray = new String[10];
		for (String str : strArray) {
			// get each - is2
			if (str.indexOf("1") > 0) {
				sortedArray[0] = str; // Thi1s
			} else if (str.indexOf("2") != -1) {
				sortedArray[1] = str; // is2
			} else if (str.indexOf("3") != -1) {
				sortedArray[2] = str; // 3a
				System.out.println(str);
			} else if (str.indexOf("4") != -1) {
				sortedArray[3] = str; // T4est
			} else if (str.indexOf("5") != -1) {
				sortedArray[4] = str;
			} else if (str.indexOf("6") != -1) {
				sortedArray[5] = str;
			} else if (str.indexOf("7") != -1) {
				sortedArray[6] = str;
			} else if (str.indexOf("8") != -1) {
				sortedArray[7] = str;
			} else if (str.indexOf("9") != -1) {
				sortedArray[8] = str;
			} else {
				// System.exit(1);
			}
		}
		String finalStr = "";
		for (int i = 0; i < sortedArray.length; i++) {
			if (sortedArray[i] != null) {
				String temp = sortedArray[i] + " ";
				finalStr += temp;
			}
		}
		System.out.println(finalStr);

	}

}
