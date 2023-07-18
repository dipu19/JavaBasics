package examples;

public class Pyramid17 {
	public static void main(String[] args) {
		int rows = 5;
		for(int i=0;i<rows;i++) {
			//printing space
			for(int j=0;j<rows-1-i;j++) {
				System.out.print(" ");
			}
			//printing character
			int numberToCharOuter = 65;
			for(int j=0;j<i+1;j++) {
				int numberToChar = 65+j;
				System.out.print((char)numberToChar); 
				numberToCharOuter = numberToChar;
			}
		
			for(int j=0;j<i;j++) {
				numberToCharOuter = numberToCharOuter-1;
				System.out.print((char)numberToCharOuter);
			}
			//printing the new line
			System.out.println();
		}
	
	}
}
