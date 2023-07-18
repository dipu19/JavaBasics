package examples;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		int number = 4;
		double secondNumber = number;
		int count = 0;
		for(int i=1;i<=(int)Math.sqrt(secondNumber);i++) {
			if(number%i==0) {
				count=count+1;
			}
		}
		if(count>1) {
			System.out.println("Number is not prime");
		}else {
			System.out.print("Number is prime");
		}
	}
}
