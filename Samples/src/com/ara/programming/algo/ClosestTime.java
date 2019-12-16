package com.ara.programming.algo;

import java.util.ArrayList;
import java.util.List;

public class ClosestTime {

	public static void main(String[] args) {
		String time = "19:34";
		
		String[] strarray = time.split(":");
        //19
        String hour = strarray[0];
        //34
        String min = strarray[1];
        
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<hour.length();i++) {
            list.add(Integer.parseInt(""+hour.charAt(i)));
        }
        for (int i=0;i<min.length();i++) {
            list.add(Integer.parseInt(""+min.charAt(i)));
        }
        
        list.stream().forEach(System.out::print);
        
        String closestTime = "";
        
        for (int i : list) {
        	
        }
        time.compareTo(closestTime);

	}

}
