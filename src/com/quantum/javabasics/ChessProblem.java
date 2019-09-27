package com.quantum.javabasics;
import java.util.*;
public class ChessProblem {
	 static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
	 int c=0;
		/*
		 * System.out.println("Enter n value"); Scanner sc=new Scanner(System.in);
		 * n=sc.nextInt(); System.out.println("Enter value of k"); k=sc.nextInt();
		 * System.out.println("Enter value of r_q"); r_q=sc.nextInt();
		 * System.out.println("Enter value of c_q"); c_q=sc.nextInt();
		 * System.out.println("Enter the value to array"); for(int i=0;i<n;i++) { for
		 * (int j=0;j<n;j++) { obstacles[i][j]=sc.nextInt(); } }
		 */
	    
     int[][] cb =new int[n+1][n+1];
      int r=n+1-r_q;
      for(int i=0;i<k;i++){
          cb[n+1-obstacles[i][0]][obstacles[i][1]]=-1;
      }
      for(int i=0;i<n;i++){
          cb[i][0]=-1;
      }
      for(int i=0;i<n;i++){
          cb[0][i]=-1;
      }
for(int i=r+1;i<=n;i++){
    if(cb[i][c_q]!=-1){
        c++;
    } else {
             break;
         }
}
for(int i=r-1;i>0;i--){
    if(cb[i][c_q]!=-1){
        c++;
    } else {
             break;
         }
}
     for (int i = c_q+1; i <= n; i++) {
         if (cb[r][i] != -1) {
             c++;
         } else {
             break;
         }
     }
     for (int i = c_q-1; i >0; i--) {
         if (cb[r][i] != -1) {
             c++;
         } else {
             break;
         }
     }
     for(int k1=1;((r-k1)>0)&&((c_q-k1)>0);k1++){
         if(cb[r-k1][c_q-k1]!=-1){
             c++;
         } else {
             break;
         }
     }
     for (int k1 = 1; ((r - k1) > 0) && ((c_q + k1) < n+1); k1++) {
         if (cb[r - k1][c_q + k1] != -1) {
             c++;
         } else {
             break;
         }
     }
     for (int k1 = 1; ((r + k1) < n+1) && ((c_q + k1) < n + 1); k1++) {
         if (cb[r + k1][c_q + k1] != -1) {
             c++;
         }else{
             break;
         }
     }
     for (int k1 = 1; ((r + k1) < n + 1) && ((c_q - k1) >0); k1++) {
         if (cb[r + k1][c_q - k1] != -1) {
             c++;
         } else {
             break;
         }
     }
return c;
}
	 public static void main(String[] args)
	 {
		  System.out.println("Enter n value");
		  Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    System.out.println("Enter value of k");
		     int k=sc.nextInt();
		    System.out.println("Enter value of r_q");
		     int r_q=sc.nextInt();
		    System.out.println("Enter value of c_q");
		     int c_q=sc.nextInt();
		    System.out.println("Enter the value to array");
		    int[][] obstacles=new int[n][n];
		    for(int i=0;i<n;i++)
		    {
		    	for (int j=0;j<n;j++)
		    	{
		    		obstacles[i][j]=sc.nextInt();
		    	}
		    }
		 ChessProblem.queensAttack(n,k,r_q,c_q,obstacles);
	 }
}
