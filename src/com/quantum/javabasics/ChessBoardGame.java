package com.quantum.javabasics;

import java.util.Scanner;

public class ChessBoardGame {
	public static String chessboardGame(int x, int y) {
	    x=x%4; 
	    y=y%4;
	    if((y==0)||(y==3)||(x==0)||(x==3)) 
	    { 
	        return "First Player";
	    }
	    return "Second Player";
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value");
		int x = sc.nextInt();
		System.out.println("Enter y value");
		int y = sc.nextInt();
		ChessBoardGame object = new ChessBoardGame();
		System.out.println(object.chessboardGame(x, y));
		
	}
}
