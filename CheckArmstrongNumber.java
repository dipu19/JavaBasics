package examples;

public class CheckArmstrongNumber {
	public static void main(String[] args) {
		int number = 153;
		int numberOfDigit = 0;
		int actualNumber= number;
		int finalActualNumber = number;
		while(number%10>0) {
			numberOfDigit = numberOfDigit+1;
			number=number/10;
		}
		double power = numberOfDigit;
		double numberForArmstrong = 0;
		while(numberOfDigit>0) {
			double digit = actualNumber%10;
			numberForArmstrong = numberForArmstrong+Math.pow(digit, power);
			numberOfDigit--;
			actualNumber = actualNumber/10;
		}
		if((double) finalActualNumber == numberForArmstrong) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}
}
