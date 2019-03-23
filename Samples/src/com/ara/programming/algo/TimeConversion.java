package com.ara.programming.algo;

public class TimeConversion {

	public static void main(String[] args) {
		String s= "06:40:03AM";
        String mtime = "";
        String swo = s.substring(0,8);
        // 07:05:45
        String[] tokens = swo.split(":");
        int ht = Integer.parseInt(tokens[0]);
        int mt = Integer.parseInt(tokens[1]);
        int st = Integer.parseInt(tokens[2]);

        if (!(1<=ht && ht<=12)) {
            System.exit(1);
        }
        if (!(0<=mt && mt<=59) || !(0<=st && st<=59)) {
            System.exit(1);
        }
        int hr = 12;
        String hrStr = "";
        int hrToken = Integer.parseInt(tokens[0]);
        if (s.contains("PM")) {
            if (1<=hrToken && hrToken<=11) {
                hr += hrToken;
            } else {
                hr = hrToken;
            }
            mtime = hr+":"+tokens[1]+":"+tokens[2];
        } else {
            if (hrToken == 12) {
                hrStr = "00";
            } else {
                if (1<=hrToken && hrToken<=9) {
                    hrStr = "0"+hrToken;
                } else {
                    hrStr = ""+hrToken;
                }
            }
            mtime = hrStr+":"+tokens[1]+":"+tokens[2];
        }
        System.out.println(mtime);

	}

}
