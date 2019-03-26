package com.ara.programming.algo;

public class CountingValleys {

	public static void main(String[] args) {
		String s = "UDDDUDUU";
		int n = 8;
        if (!(2<=n && n<=Math.pow(10,6))) {
            System.exit(1);
        }
        int len = s.length();
        int count = 0;
        int tcount = 0;
        int mountains=0;
        int valleys=0;
        //UDDDUD U U
        for (int i=0;i<len;i++) {
            String step = s.substring(i,i+1);
            System.out.println(step);
            if ("U".equals(step)) {
                count = 1; //1
            } else if ("D".equals(step)) {
                count = -1; //1
            } else {
                System.exit(1);
            }
            tcount+=count; //0
            if (tcount>0) {
                // above sea
            } else if (tcount==0) {
                // at sea = did one up/down or down/up (any count)
                // but up or down? 
                if (count==-1) {
                    //means, he came down.. 
                    mountains+=1;
                } else {
                    valleys+=1;
                }
            } else {
                // tcount<0 = below sea
            }
        }
        System.out.println("mountains: "+mountains+", valleys: "+valleys);
	}

}
