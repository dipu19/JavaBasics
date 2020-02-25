package com.quantum.javabasics;
import java.util.*;
public class AdLikedByPeople {
	public static void main(String[] args)
	{
		System.out.println("Enter till the days you want to calculate ");
		Scanner d=new Scanner(System.in);
		int days=d.nextInt();
		int share=5;
		int like=0;
		int total=0;
		for(int i=1;i<=days;i++)
		{
			like=share/2;
			share=like*3;
			total=total+like;
		}
		System.out.println("Total person liked the ad "+total);
	}

}
