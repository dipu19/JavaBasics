package com.quantum.javabasics;

public class MergeSortFromGeeksForGeeks {

	public void merge(int[] arr, int l, int m, int r)
	{
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] firstHalf = new int[n1];
		int[] secondHalf = new int[n2];
		
		for(int i=0;i<n1;++i)
		{
			firstHalf [i] = arr[l+i];
		}
		for(int j=0;j<n2;++j)
		{
			secondHalf[j] = arr[m + 1+ j];
		}
		
		int i= 0;
		int j=0;
		
		int k=l;
		while(i<n1 &&j<n2)
		{
			if(firstHalf[i]<=secondHalf[j])
			{
				arr[k] = firstHalf[i];
				i++;
			}
			else
			{
				arr[k] = secondHalf[j];
			}
		}
		
		 while (i < n1) 
	        { 
	            arr[k] = firstHalf[i]; 
	            i++; 
	            k++; 
	        } 
	  
	       
	        while (j < n2) 
	        { 
	            arr[k] = secondHalf[j]; 
	            j++; 
	            k++; 
	        } 
	}
	
	public void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
   
            merge(arr, l, m, r); 
        } 
        
    }
	public void show(int[] arr)
	{
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		MergeSortFromGeeksForGeeks obj = new MergeSortFromGeeksForGeeks();
		int [] arr= {1,4,2,5,3};
		int l = 0;
		int r = arr.length-1; 
		obj.sort(arr, l, r);
		obj.show(arr);
	}

	
	
}
