package com.quantum.javabasics;

public class MergeSort {

	public void mergeSort(int[] arr,int n)
	{
		if(n<2)
		{
			return;
		}
		else
		{
			
			int end = n;
			int mid = n/2;
			int[] leftArray=new int[mid];
			int[] rightArray = new int[end-mid];
			for(int i=0;i<mid;i++)
			{
				leftArray[i] = arr[i];
			}
			for(int i=mid;i<end;i++)
			{
				rightArray[i-mid] = arr[i];
			}
			mergeSort(leftArray,mid);
			mergeSort(rightArray,n-mid);
			merge(arr,leftArray,rightArray,mid,n-mid);
		}
		
		
	}
		public  void merge(int[] a, int[] l, int[] r, int left, int right) 
		{
				  
				    int i = 0, j = 0, k = 0;
				    while (i < left && j < right) {
				        if (l[i] <= r[j]) {
				            a[k] = l[i];
				            k++;
				            i++;
				        }
				        else {
				            a[k] = r[j];
				            k++;
				            j++;
				        }
				    }
				    while (i < left) {
				        a[k] = l[i];
				        k++;
				        i++;
				    }
				    while (j < right) {
				        a[k] = r[j];
				        k++;
				        j++;
				    }
				}
		public static void main(String[] args)
		{
			int[] arr = {1,5,4,2,3};
			int n=arr.length;
			MergeSort ms = new MergeSort();
			ms.mergeSort(arr, n);
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
	
}
