package problems;

public class LargestElementInArray {
	
	//normal method
	public void findLargesstNumber(int[] arr) {
		int largest = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest number " +largest);
	}
	public static void main(String[] args) {
		int[] arr = {1,0,2,3,4,5};
		LargestElementInArray lo = new LargestElementInArray();
		lo.findLargesstNumber(arr);
	}
}
