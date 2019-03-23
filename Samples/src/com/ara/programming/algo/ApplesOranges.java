package com.ara.programming.algo;

public class ApplesOranges {

	public static void main(String[] args) {
		int[] apples = {-2, 2, 1};
		int[] oranges = {5, -6};
		int s=7;
		int t=11;
		int 
		int alen = apples.length;
        int acount = 0;
        for (int i=0;i<alen;i++) {
            // 5-2 = 3 < 5 = false
            int adist = a+apples[i];
            if (adist>=a && adist<=b) {
                acount = acount+1;
            }
        }
        System.out.println(acount);

        int olen = oranges.length;
        int ocount = 0;
        for (int i=0;i<olen;i++) {
            // 15+5 = 20 > 11 = false
            int odist = b+oranges[i];
            if (odist>=a && odist<=b) {
                ocount += 1;
            }
        }
        System.out.println(ocount);

	}

}
