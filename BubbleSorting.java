package sorting;

public class BubbleSorting {
	public void bubbleSort(int[] arr) {
		int size = arr.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]= arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,2,1,4,5,1};
		BubbleSorting bubbleObject = new BubbleSorting();
		bubbleObject.bubbleSort(arr); 
	}
}
