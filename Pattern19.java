package examples;

public class Pattern19 {
	public static void main(String[] args) {
		int rows = 18;
		int halfOfTheRows = rows/2;
		for(int i=0;i<halfOfTheRows;i++) {
			//printing *
			for(int j=0;j<halfOfTheRows-i;j++) {
				System.out.print("*");
			}
			//print space
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			//print *
			for(int j=0;j<halfOfTheRows-i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=0;i<halfOfTheRows;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<rows-(2+(i*2));j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			//printing space
			
		}
	}
}
