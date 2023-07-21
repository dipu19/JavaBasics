package sorting;


//[4,5,3,6,0,2]
public class QuickSort {
	public static int quickSort(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i < j) {
			while(arr[i]<=pivot && i<= high-1) {
				i++;
			}
			while(arr[j]>pivot && j>=low+1) {
				j--;
			}
			if(i<j) {
				int temp  = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
					
		}
		int tempVar = arr[low];
		arr[low] = arr[j];
		arr[j] = tempVar;
		return j;
	}
	public void sort(int[] arr,int low,int high) {
		if(low<high) {
			int pivotIndex = QuickSort.quickSort(arr, low, high);
			sort(arr,low, pivotIndex-1);
			sort(arr,pivotIndex+1, high);
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {1,4,3,0,6,3};
		int low = 0;
		int high = arr.length-1;
		QuickSort qo = new QuickSort();
		qo.sort(arr, low, high);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
