package recursion;


public class ReverseAnArray {
	public void reverseArray(int[] array) {
		for(int i=0;i<array.length/2;i++) {
			array[i] = array[i]+array[array.length-1-i];
			array[array.length-1-i] = array[i]-array[array.length-1-i];
			array[i] = array[i]-array[array.length-1-i];
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		ReverseAnArray r = new ReverseAnArray();
		int[] arr = {1,2,3,4};
		r.reverseArray(arr);
	}
}
