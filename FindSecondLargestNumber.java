package problems;

public class FindSecondLargestNumber {
 public void findSecondLargest(int[] arr) {
	 //find largest number
	 int largestNumber = 0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]>largestNumber) {
			 largestNumber = arr[i];
		 }
	 }
	 int secondLargestNumber = 0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]>=secondLargestNumber && arr[i]<largestNumber) {
			 secondLargestNumber = arr[i];
		 }
	 }
	 System.out.println("Second largest number is "+secondLargestNumber+ " and largest number is "+largestNumber);
 }
 public static void main(String[] args) {
	 int[] arr = {1,3,2,4,9,5,6,0};
	 FindSecondLargestNumber fo = new FindSecondLargestNumber();
	 fo.findSecondLargest(arr);
 }
}
