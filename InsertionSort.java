package sorting;

public class InsertionSort {
	public void insertionSort(int[] arr) {
		int size = arr.length;
		for(int i=0;i<size-1;i++) {
			if(arr[i+1]<arr[i]) {
				for(int j=i+1;j>0;j--) {
					if(arr[j]<arr[j-1]) {
						arr[j] = arr[j]+arr[j-1];
						arr[j-1] = arr[j]-arr[j-1];
						arr[j]=arr[j]-arr[j-1];
					}
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,3,4,5};
		InsertionSort insertionObject = new InsertionSort();
		insertionObject.insertionSort(arr);
		
	}
}
