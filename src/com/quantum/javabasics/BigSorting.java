package com.quantum.javabasics;
import java.util.*;
public class BigSorting {
public static void main(String[] args)
{
	System.out.println("Enter the value of n ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    System.out.println("Enter the value to array");
    String [] unsorted=new String [n];

 for(int i=0;i<n;i++)
 {
	 unsorted[i]=sc.toString();
 }
			
 Arrays.sort(unsorted, new Comparator<String>(){
     public int compare(String a, String b){
         if(a.length() == b.length()) 
            return a.compareTo(b);
         return a.length() - b.length();
 }});

 for(int i=0;i<n;i++)
 {
	 System.out.println(unsorted[i]);
 }

}
}
