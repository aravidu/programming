package com.ara.programming.algo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTripletArray {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> val = new ArrayList<>();
		int aScore = 0;
		int bScore = 0;
		for (int i=0; i<3;i++) {
			for (int j=0;j<3;j++) {
				if (i==j) {
					int tempA = a.get(i);
					int tempB = b.get(j);
					if (!(1<=tempA && tempA<=100 && 1<=tempB && 1<=tempB)) {
						continue;
					}
					if (tempA<tempB) {
						bScore += 1;
					} else if (tempA>tempB) {
						aScore += 1;
					}
				}
			}
		}
		
		val.add(aScore);
		val.add(bScore);
		return val;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\aravind.datta\\Desktop\\aravind\\gd\\desktop_t430\\resume\\hackerrank\\abc.txt"));
		//BufferedWriter bufferedWriter = new BufferedWriter(new BufferedOutputStream());
		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = compareTriplets(a, b);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
