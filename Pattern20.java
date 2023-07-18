package examples;

public class Pattern20 {
	public static void main(String[] args) {
		int rows = 10;
		int halfOfTheRows = rows/2;
		for(int i=0;i<halfOfTheRows;i++) {
			//print *
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			//print space
			for(int j=0;j<rows-(i*2+2);j++) {
				System.out.print(" ");
			}
			//print *
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<halfOfTheRows;i++) {
			//print *
			for(int j=0;j<halfOfTheRows-i;j++) {
				System.out.print("*");
			}
			//print space
			for(int j=0;j<i*2;j++)
			{
				System.out.print(" ");
			}
			//print * 
			for(int j=halfOfTheRows-1-i;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		
		}
	}
}
