package examples;

public class Pattern12 {
	public static void main(String[] args) {
		int rows = 4;
		for(int i=0;i<rows;i++) {
			//printing 1st set of number
			for(int j=0;j<i+1;j++) {
				System.out.print(j+1);
			}
			//printing space in the same row
			for(int j=0;j<(rows-1-i)*2;j++) {
				System.out.print(" ");
			}
			for(int j=i+1;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
