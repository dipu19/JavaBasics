package com.quantum.javabasics;

import java.util.Scanner;



public class ChocolateFeast {
	public int chocolateFeast(int n,int c,int m)
	{
		//n=total amount bobby has.
		//c=cost of the chocolate.
		//m=number wrapper need for a chocolate.
        int totalnumberOfChocolates = n / c;
        int totalWrappers = totalnumberOfChocolates;
        int freeChocolate = 0;
        while (m <= totalWrappers) {
            int wrapperTogive=totalWrappers-(totalWrappers%m) ;

            freeChocolate = totalWrappers / m;

            totalWrappers = (totalWrappers - wrapperTogive) + freeChocolate;

            totalnumberOfChocolates=totalnumberOfChocolates + freeChocolate;

        }


		return totalnumberOfChocolates;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the money you have");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the price of the chocolate");
		int c=sc.nextInt();
		System.out.println("Enter the number of wrapper need to get a chocolate ");
		int m=sc.nextInt();
		ChocolateFeast sa=new ChocolateFeast();
		System.out.println("number of chocolate you can get :"+sa.chocolateFeast(n, c, m));
	}
}
