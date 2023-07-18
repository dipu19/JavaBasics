package examples;

public class Divisiors {
	public static void main(String[] args) {
		int number = 38;
		int counter = 0;
		for(int i=1;i<=number/2;i++) {
			if(number%i == 0) {
				System.out.print(i+" ");
				counter=counter+1;
			}
		}
		System.out.print(number);
		System.out.println();
		
		// Second approach
		double secondNumber = number;
		for(int i=1;i<= Math.sqrt(secondNumber);i++) {
			if(number%i == 0) {
				System.out.print(i+" ");
				if(i!=Math.sqrt(secondNumber)) {
					System.out.print(number/i+" ");
				}
			}
		}
	}
}
