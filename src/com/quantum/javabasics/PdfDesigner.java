package com.quantum.javabasics;

public class PdfDesigner {
	public static void main(String[] args)
	{
	int[] h= {1 ,3 ,1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 ,7};
	String word="abc";
	int max=0;
	int ascii;
	   for(int i=0;i<word.length();i++)
       {
        ascii=(int)word.charAt(i);
        ascii-=97;
        if(h[max]<h[ascii]) h[max]=h[ascii];
       }
   System.out.println(word.length()*1*h[max]);
	}
}
