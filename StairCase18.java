package examples;

public class StairCase18 {
	public static void main(String[] args) {
		int rows = 4;
		for(int i=0;i<=rows;i++) {
			int charToNumber = 65+rows-i;
			for(int j=0;j<i+1;j++) {
				int innerCharToNumber = charToNumber+j;
				System.out.print((char)innerCharToNumber);
			}
			System.out.println();
		}
	}
}
