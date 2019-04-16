package com.ara.programming.algo;

import java.util.LinkedHashMap;
import java.util.Map;

/*

You are a developer for a university. Your current project is to develop a system for students to find 
courses they share with friends. The university has a system for querying courses students 
are enrolled in, returned as a list of (ID, course) pairs.

Write a function that takes in a list of (student ID number, course name) pairs and returns, 
for every pair of students, a list of all courses they share.

Sample Input

String[][] studentCoursePairs = { 
    {"58", "Software Design"},
    {"58", "Linear Algebra"},
    {"94", "Art History"},
    {"94", "Operating Systems"},
    {"17", "Software Design"},
    {"58", "Mechanics"},
    {"58", "Economics"},
    {"17", "Linear Algebra"},
    {"17", "Political Science"},
    {"94", "Economics"},
};

Sample Output

find_pairs(student_course_pairs) =>
{
    [58, 17]: ["Software Design", "Linear Algebra"]
    [58, 94]: ["Economics"]
    [17, 94]: []
}


*/
class CourseIdPairs {
	public static void main(String[] args) {
		String[][] studentCoursePairs = { 
				{ "58", "Software Design" }, 
				{ "17", "Software Design" },
				{ "58", "Linear Algebra" },
				{ "17", "Linear Algebra" }, 
				{ "58", "Economics" }, 
				{ "94", "Economics" }, 
				{ "94", "Art History" }, 
				{ "94", "Operating Systems" }, 
				{ "58", "Mechanics" }, 
				{ "17", "Political Science" },
				};

		// Call function for question one here
		Map<String, String> map = studentCoursePairs(studentCoursePairs);

		// Print results here
		map.entrySet().stream().forEach(System.out::println);

	}

	public static Map<String, String> studentCoursePairs(String[][] enrollments) {
		// {{"",""}, {"",""}, {"",""}}
		int len = enrollments.length;

		Map<String, String> map = new LinkedHashMap<String, String>();

		for (int i = 0; i < len; i++) {
			String id = enrollments[i][0]; // 58
			String course = enrollments[i][1]; // software design

			//System.out.println(id + ", " + course);

			for (int j = 0; j < len; j++) {
				String innerId = enrollments[j][0]; // 58
				String innerCourse = enrollments[j][1]; // software design
				// System.out.println(innerId + ", "+ innerCourse);
				if (!id.equals(innerId)) {
					if (course.equals(innerCourse)) {
						if (map.containsKey(id + "," + innerId) || map.containsKey(innerId + "," + id)) {
							boolean from2 = false;
							String key1 = id + "," + innerId;
							String key2 = innerId + "," + id;
							String value = map.get(key1); // software design
							if (value == null) {
								value = map.get(key2); // software design
								from2 = true;
							}
							if (from2) {
								if (value.contains(course)) {
									continue;
								}
								map.put(key2, value + "," + course);
							} else {
								if (value.contains(course)) {
									continue;
								}
								map.put(key1, value + "," + course);
							}
						} else {
							map.put(id + "," + innerId, course);// 58,17, software design
							// System.out.println(id+","+innerId+ ", "+course);
						}
					} else {
						//map.put(id + "," + innerId, "");// 58,17, software design
					}
				} else {
					continue;
				}
			}
		}

		return map;
	}
}
