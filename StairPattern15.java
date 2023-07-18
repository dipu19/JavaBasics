package examples;

public class StairPattern15 {
	public static void main(String[] args) {
		int rows = 5;
		for(int i=0;i<rows;i++) {
			for(int j=rows;j>i;j--) {
				int charToNumber = 65+(rows-j);
				System.out.print((char)charToNumber);
			}
			System.out.println();
		}
	}
}
