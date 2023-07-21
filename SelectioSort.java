package sorting;

public class SelectioSort {
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			
			int minIndex = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
					
				}
			}
			//swapping number 
			int swappingNumber = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i]=swappingNumber;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,3,2,4,0,1};
		SelectioSort.sort(arr);
	}
}
