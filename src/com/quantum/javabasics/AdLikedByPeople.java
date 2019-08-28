package com.quantum.javabasics;
import java.util.*;
public class AdLikedByPeople {
	public static void main(String[] args)
	{
		System.out.println("Enter till the days you want to calculate ");
		Scanner d=new Scanner(System.in);
		int days=d.nextInt();
		int share=5;//1st day 5 people share the ad.
		int like=0;//from shared people (share/2) people like the ad.
		int total=0;
		for(int i=1;i<=days;i++)
		{
			like=share/2;
			share=like*3;//from 2nd day every people who like the ad they share to 3 people.
			total=total+like;
		}
		System.out.println("Total person liked the ad ="+total);
	}

}
