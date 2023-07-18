package examples;

public class CheckPalindrome {
	public static void main(String[] args) {
		int number = 121;
		int actualNumber = number;
		int reverseNumber = 0;
		while(number%10>0) {
			int digit = number%10;
			reverseNumber = reverseNumber*10+digit;
			number=number/10;
		}
		if(reverseNumber == actualNumber) {
			System.out.println("Palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}
}
