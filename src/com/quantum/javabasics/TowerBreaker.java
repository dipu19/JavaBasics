package com.quantum.javabasics;

import java.util.Scanner;

public class TowerBreaker {

	public void towerBreak(int m, int n)
	{
		//m is the number of towers 
		//n is the height of the towers
		if(m == 1)
		{
			System.out.println("Second player is winner");
		}
		if(n%2 == 0)
		{
			System.out.println("Second player is winner");
		}
		else
		{
			System.out.println("First player is winner");
		}
	}
	public static void main(String[] args)
	{
		TowerBreaker tb = new TowerBreaker();
		System.out.println("Enter the number of tower");
		Scanner sc = new Scanner(System.in);
		int noOfTowers = sc.nextInt();
		System.out.println("Enter the height of towers");
		int height = sc.nextInt();
		tb.towerBreak(noOfTowers, height);
	}
}
