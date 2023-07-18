package examples;

public class StairPattern16 {
	public static void main(String[] args) {
		int rows = 5;
		int numberToChar = 65;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print((char)numberToChar);
			}
			numberToChar = numberToChar+1;
			System.out.println();
		}
	}
}
