package sorting;

public class RecursiveBubbleSort {
	
	public void recursiveSort(int[]arr,int endIndex,int startIndex) {
		if(startIndex == endIndex) {
			return ;
		}
		for(int i=0;i<endIndex;i++) {
			if(arr[i]>arr[i+1]) {
				arr[i]=arr[i]+arr[i+1];
				arr[i+1]=arr[i]-arr[i+1];
				arr[i]=arr[i]-arr[i+1];
			}
		}
		startIndex = 0;
		endIndex = endIndex-1;
		recursiveSort(arr,endIndex,startIndex);
	}
	public static void main(String[] args) {
		int [] arr = {1,2,4,3,6,0};
		int startIndex = 0;
		int endIndex = arr.length-1;
		RecursiveBubbleSort r = new RecursiveBubbleSort();
		r.recursiveSort(arr, endIndex, startIndex);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
