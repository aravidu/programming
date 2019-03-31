package com.ara.programming.algo;

public class RobotMoves {

	public static void main(String[] args) {
		String moves = "UDDUURLRLLRRUDUDLLRLURLRLRLUUDLULRULRLDDDUDDDDLRRDDRDRLRLURRLLRUDURULULRDRDLURLUDRRLRLDDLUUULUDUUUUL";
        int result = 0;
        for (int i=0;i<moves.length();i++) {
            String move = moves.substring(i,i+1);
            if ("U".equals(move) || "D".equals(move)) {
            	System.out.print("U".equals(move) ? "/" : "\\");
                result += "U".equals(move) ? 1 : -1;
            } else {
            	System.out.print("L".equals(move) ? "<-" : "->");
                result += "L".equals(move) ? -2 : 2;
            }
        }
        System.out.println(result);
	}

}
