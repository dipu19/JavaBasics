package examples;

public class NumberStairCase13 {
	public static void main(String[] args) {
		int numberToPrint = 1;
		int rows = 5;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(numberToPrint);
				numberToPrint = numberToPrint+1;
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
