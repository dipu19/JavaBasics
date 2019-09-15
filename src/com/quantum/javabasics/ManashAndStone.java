package com.quantum.javabasics;

public class ManashAndStone {
	public static  void main(String [] args)
	{       int n = 10;
            int a = 15;
            int b = 16;
            
            for(int i=n-1; i>-1; i--){
                if(a<b)
                    System.out.print(((a*i)+(b*(n-1-i)))+" ");
                else if(a>b)
                    System.out.print(((b*i)+(a*(n-1-i)))+" ");
                else{
                    System.out.print(((a*i)+(b*(n-1-i))));
                    break;
                }
            }
            System.out.println();
        }

}
