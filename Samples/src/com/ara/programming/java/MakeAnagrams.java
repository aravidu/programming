package com.ara.programming.java;

public class MakeAnagrams {
	
	public static void main(String[] args) {
		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

		int[] iarrA = new int[26];
        char[] cArrayOfA = a.toCharArray(); //{c,d,e}
        char[] cArrayOfB = b.toCharArray(); //{a,b,c}
        
        for (int i=0;i<cArrayOfA.length;i++) {
            char curr = cArrayOfA[i]; //c
            if (curr == 'a') {
                iarrA[0] += 1;
            } else if (curr == 'b') {
                iarrA[1] += 1;
            } else if (curr == 'c') {
                iarrA[2] += 1;
            } else if (curr == 'd') {
                iarrA[3] += 1;
            } else if (curr == 'e') {
                iarrA[4] += 1;
            } else if (curr == 'f') {
                iarrA[5] += 1;
            } else if (curr == 'g') {
                iarrA[6] += 1;
            } else if (curr == 'h') {
                iarrA[7] += 1;
            } else if (curr == 'i') {
                iarrA[8] += 1;
            } else if (curr == 'j') {
                iarrA[9] += 1;
            } else if (curr == 'k') {
                iarrA[10] += 1;
            } else if (curr == 'l') {
                iarrA[11] += 1;
            } else if (curr == 'm') {
                iarrA[12] += 1;
            } else if (curr == 'n') {
                iarrA[13] += 1;
            } else if (curr == 'o') {
                iarrA[14] += 1;
            } else if (curr == 'p') {
                iarrA[15] += 1;
            } else if (curr == 'q') {
                iarrA[16] += 1;
            } else if (curr == 'r') {
                iarrA[17] += 1;
            } else if (curr == 's') {
                iarrA[18] += 1;
            } else if (curr == 't') {
                iarrA[19] += 1;
            } else if (curr == 'u') {
                iarrA[20] += 1;
            } else if (curr == 'v') {
                iarrA[21] += 1;
            } else if (curr == 'w') {
                iarrA[22] += 1;
            } else if (curr == 'x') {
                iarrA[23] += 1;
            } else if (curr == 'y') {
                iarrA[24] += 1;
            } else if (curr == 'z') {
                iarrA[25] += 1;
            }
        }//{0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        
        
        int[] iarrB = new int[26];
        for (int i=0;i<cArrayOfB.length;i++) {
            char curr = cArrayOfB[i]; //a
            if (curr == 'a') {
            	iarrB[0] += 1;
            } else if (curr == 'b') {
            	iarrB[1] += 1;
            } else if (curr == 'c') {
                iarrB[2] += 1;
            } else if (curr == 'd') {
                iarrB[3] += 1;
            } else if (curr == 'e') {
                iarrB[4] += 1;
            } else if (curr == 'f') {
                iarrB[5] += 1;
            } else if (curr == 'g') {
                iarrB[6] += 1;
            } else if (curr == 'h') {
                iarrB[7] += 1;
            } else if (curr == 'i') {
                iarrB[8] += 1;
            } else if (curr == 'j') {
                iarrB[9] += 1;
            } else if (curr == 'k') {
                iarrB[10] += 1;
            } else if (curr == 'l') {
                iarrB[11] += 1;
            } else if (curr == 'm') {
                iarrB[12] += 1;
            } else if (curr == 'n') {
                iarrB[13] += 1;
            } else if (curr == 'o') {
                iarrB[14] += 1;
            } else if (curr == 'p') {
                iarrB[15] += 1;
            } else if (curr == 'q') {
                iarrB[16] += 1;
            } else if (curr == 'r') {
                iarrB[17] += 1;
            } else if (curr == 's') {
                iarrB[18] += 1;
            } else if (curr == 't') {
                iarrB[19] += 1;
            } else if (curr == 'u') {
                iarrB[20] += 1;
            } else if (curr == 'v') {
                iarrB[21] += 1;
            } else if (curr == 'w') {
                iarrB[22] += 1;
            } else if (curr == 'x') {
                iarrB[23] += 1;
            } else if (curr == 'y') {
                iarrB[24] += 1;
            } else if (curr == 'z') {
                iarrB[25] += 1;
            }
        }//{1,1,2,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        
     // [0, 2, 0, 1, 2, 0, 1, 2, 1, 2, 1, 1, 3, 0, 2, 2, 1, 2, 1, 1, 1, 1, 2, 1, 0, 0]
     // [1, 0, 2, 0, 0, 1, 1, 0, 1, 0, 0, 1, 2, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 2, 3, 1]
        int todel = 0;
        for (int i=0;i<26;i++) {
            int currA = iarrA[i]; //1
            int currB = iarrB[i];
            if (currA != currB) {
            	int curr = Math.abs(iarrA[i] - iarrB[i]);
            	todel += curr;
            }
            
        }
        System.out.println(todel);
	}
}
