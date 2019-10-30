package com.quantum.javabasics;
import java.util.*;
public class SurfaceProblem {
  public static void main(String[] args)
  {
	  System.out.println("Enter s1");
	  Scanner scanner=new Scanner(System.in);
	  int s1=scanner.nextInt();
	  System.out.println("Enter s3");
	  int s3=scanner.nextInt();
	int[][] A=new int[s1][s3];
    int tvolume=0;     
for(int i=0;i<A.length;i++){
    for(int j=0;j<A[0].length;j++){
        tvolume += (A[i][j]*4)+2; 
        if(j>=1)tvolume -= Math.min(A[i][j-1],A[i][j])*2;
        if(i>=1)tvolume -= Math.min(A[i-1][j],A[i][j])*2;
    }System.out.println(tvolume);
	
	
	
	
  }
}
}
