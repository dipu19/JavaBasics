package com.quantum.javabasics;

public class JumpingOnTheClouds {
	public static void main(String[] args)
	{
    int n=4; 
    int [] c= {0,0,1,0};
    int k=2;
    int energy = 100;
	int i = k % n; 
	energy = Math.abs((c[i] * 2 + 1)-energy) ;
	while (i != 0)
	{
	    i = (i + k) % n;
	    energy = Math.abs((c[i] * 2 + 1)-energy) ;
	}System.out.println(energy);
}
}
