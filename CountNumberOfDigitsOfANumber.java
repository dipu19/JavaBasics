package examples;

public class CountNumberOfDigitsOfANumber {
	public static void main(String[] args) {
		int number = 12345;
		int actualnUmber = number;
		int numberOfDigits = 0;
		while(number%10>0) {
			numberOfDigits = numberOfDigits+1;
			number = number/10;
		}
		System.out.println("number "+actualnUmber+" contains "+numberOfDigits+ " digits");
		String string = String.valueOf(actualnUmber);
		System.out.println("number " + actualnUmber +" contains "+string.length()+" digits");
	}
}
