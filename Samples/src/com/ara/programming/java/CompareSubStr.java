package com.ara.programming.java;

public class CompareSubStr {

	public static void main(String[] args) {
		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		int k = 144;
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		int len = s.length();
		if (!(0 <= len && len <= 1000)) {
			System.exit(1);
		}
		for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (!((65<=c && c<=90) || (97<=c && c<=122))) {
                System.exit(1);
            }
        }
		for (int i = 0; i < s.length(); i++) {
			String sub = "";
			if ((i + k) <= s.length()) {
				sub = s.substring(i, i + k); // 0,3 = wel,elc; welcometojava
			}

			if (i == 0) {
				smallest = sub;
				largest = sub;
				if (k==s.length()) {
					break;
				}
				continue;
			}
			if (sub.compareTo(smallest) < 0) {
				smallest = sub;
			}
			if (sub.compareTo(largest) > 0) {
				largest = sub;
			}
			if ((i+k)==len) {
				break;
			}
		}
		
		System.out.println(smallest + "\n" + largest);

	}

}
