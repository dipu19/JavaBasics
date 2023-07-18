package examples;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 123;
		int actualNumber = number;
		int reverseNumber =0;
		while(number%10>0) {
			int digit = number%10;
			reverseNumber = reverseNumber*10+digit;
			number= number/10;
		}
		System.out.println(reverseNumber);
	}
}
