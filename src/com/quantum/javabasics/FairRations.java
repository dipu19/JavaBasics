package com.quantum.javabasics;

import java.util.Scanner;

public class FairRations {
	 static void fairRations() {
		 int[] b= {1 ,2,4,5} ;
	 
         int sum=0;
         for(int i=0; i <b.length; i++){
       
           sum+=b[i];
    }       String number = "NO";
          int count = 0;
         if(sum % 2 == 1){
             Integer number1=Integer.valueOf(number);
             count=number1;
          System.out.println("NO");
         }
          else{
          for(int i = 0; i<b.length; i++){
            if(b[i] % 2 != 0){
                b[i] = b[i] + 1;
                b[i+1] = b[i+1] + 1;
                count+=2;
            }



        }
        


    } System.out.println(count);
    }
	 public static void main(String[] args)
	 {
		 fairRations();
}
}
