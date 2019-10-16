package com.quantum.javabasics;
import java.util.*;
public class StrongPassword1 {
   public static void main(String[] args)
   {
	   System.out.println("Enter the value of password ");
	   Scanner sc=new Scanner(System.in);
	   String password=sc.next();
	   int count1=0;
       int count2=0;
       int count3=0;
       int count4=0;
       char[] arr={'!','@','#','$','%','^','&','*','(',')','-','+'};
       if(password.length()>=6)
       {
           count1++;
       }
       for(int i=0;i<password.length();i++)
       {
           for(int j=97;j<123;j++)
           {
               if(password.charAt(i)==(char)j)
               {
                   count2++;
               }
           }
       }for(int i=0;i<password.length();i++)
       {
           for(int j=65;j<91;j++)
           {
               if(password.charAt(i)==(char)j)
               {
                   count3++;
               }
           }
       }
       for(int i=0;i<password.length();i++)
       {
           for(int j=0;j<arr.length;j++)
           {
               if(password.charAt(i)==arr[j])
               {
                   count4++;
               }
           }
       }int[] count={count1,count2,count3,count4};
       int sum=0;
       for(int i=0;i<count.length;i++)
       {
           if(count[i]>=1)
           {
               sum=sum+1;
           }
       }
       int result=0;
       if(sum<6)
       {
           System.out.println (6-(sum+1));
       }
       else {
           System.out.println(sum);
       }
	   
   }
}
