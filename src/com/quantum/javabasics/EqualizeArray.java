package com.quantum.javabasics;
import java.util.*;
public class EqualizeArray {

	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	      int max = 1;
	      Map<Integer, Integer> nums = new HashMap<>();
	      for (int i : arr)
	          if (!nums.containsKey(i))
	              nums.put(i, 1);
	          else {
	              nums.put(i, nums.get(i) + 1);
	              if (max < nums.get(i))
	                  max = nums.get(i);
	          }System.out.println(max);
	}

}
