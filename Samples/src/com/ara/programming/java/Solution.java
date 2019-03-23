package com.ara.programming.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		int val = 0;
		if (s1.getCgpa() < s2.getCgpa()) {
			val = -1;
		} else if (s1.getCgpa() == s2.getCgpa()) {
			if (s1.getFname().compareTo(s2.getFname()) == -1) {
				val = -1;
			} else if (s1.getFname().compareTo(s2.getFname()) == 0) {
				if (s1.getId() < s2.getId()) {
					val = -1;
				} else if (s1.getId() == s2.getId()) {
					val = 0;
				} else if (s1.getId() > s2.getId()) {
					val = 1;
				}
			} else if (s1.getFname().compareTo(s2.getFname()) == 1) {
				val = 1;
			}
		} else if (s1.getCgpa() > s2.getCgpa()) {
			val = 1;
		}
		return val;
	}	
}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList, new MyComparator<Student>());
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
