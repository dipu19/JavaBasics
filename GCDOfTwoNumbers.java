package examples;

public class GCDOfTwoNumbers {
	public static void main(String[] args) {
		int firstNumber = 3;
		int secondNumber = 4;
		int minNumber = Math.min(firstNumber, secondNumber);
		int gcd = firstNumber*secondNumber;
		for(int i=1;i<=minNumber;i++) {
			if(firstNumber%i==0 && secondNumber%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
