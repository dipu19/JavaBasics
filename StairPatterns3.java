package examples;

public class StairPatterns3 {
	public static void main(String[] args) {
		int rows = 5;
		for(int i =0;i<rows;i++) {
			for(int j=0;j<rows-i;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}
