package com.quantum.javabasics;
import java.util.*;
public class RunningTimeOfAlgorthim {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of arr");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the value to arr");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}  int totalShifts = 0;
        int nSorted = 1; // 
       
        while (nSorted < n)
        {
                // get the next item
                int newInt = arr[nSorted];
                int i = 0;
                // locate its position in smaller array
                for (i = 0; i < nSorted; i++)
                    
                    if (arr[i] > newInt)
                    {
                        arr[nSorted] = arr[i];
                        arr[i] = newInt; 
                      
                        newInt = arr[nSorted];
                                    totalShifts++;
                    }
                nSorted++;
        }
        
        System.out.println(totalShifts);
	}
}
