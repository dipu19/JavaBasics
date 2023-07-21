package sorting;

public class RecursiveInsertionSort {
	public static void sorting(int[] arr, int startIndex) {
		if(startIndex==arr.length) {
			return;
		}
		for(int i=startIndex;i>0;i--) {
			if(arr[i]<arr[i-1]) {
				arr[i] = arr[i]+arr[i-1];
				arr[i-1]=arr[i]-arr[i-1];
				arr[i]=arr[i]-arr[i-1];
			}
		}
		sorting(arr,startIndex+1);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,0,3,6,4,5,3};
		RecursiveInsertionSort.sorting(arr,1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
