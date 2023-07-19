package recursion;


public class SumOfNaturalsNumber {
	int startNumber = 0;
	int sum = 0;
	public void sum(int target) {
		while(startNumber<target) {
			sum =sum+startNumber;
			startNumber=startNumber+1;
		}
		System.out.println("Sum "+sum);
		return;

	}
	public static void main(String[] args) {
		int target = 5;
		SumOfNaturalsNumber s = new SumOfNaturalsNumber();
		s.sum(target);
	}
}
