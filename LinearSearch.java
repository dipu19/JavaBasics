package problems;

public class LinearSearch {
	public void linearSearch(int[] arr, int number) {
		int indexValue = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == number) {
				indexValue = i;
				break;
			}
		}if(indexValue != -1)
		System.out.println("Number "+number+" is present at index "+indexValue);
		else
			System.out.println("Number "+number+" is not present");
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
		int number = 3;
		LinearSearch object = new LinearSearch();
		object.linearSearch(arr, number);
	}
}
