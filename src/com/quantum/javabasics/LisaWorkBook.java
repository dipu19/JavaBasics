package com.quantum.javabasics;



public class LisaWorkBook {

	public void check(int n,int k,int[] m ) {
		          int index=0;
		          int j=2;
		          int x=0;
		          int y=0;
		          for(int i=0 ; i<n ; i++){
		              
		              x = x+((j-2)/k)+1;
		             
		          for( j=1 ; j<=m[i] ; j++){
		              y = x+(j-1)/k;
		              if(j==y)
		                  index++;
		          }
		      }
		      System.out.println(index);
		          }
	
	
	public static void main(String[] args)
	{
		LisaWorkBook object = new LisaWorkBook();
		int n= 5;
		int k= 3;
		int[] arr= {4,2,6,1,10};
		object.check(n, k, arr);
	}
}
