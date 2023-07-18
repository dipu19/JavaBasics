package examples;

public class StairsWithNumbers {
	public static void main(String[] args) {
		int numberToPrint = 1;
		int rows = 8;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(numberToPrint);
				numberToPrint = numberToPrint==1?0:1;
			}
			System.out.println();
			numberToPrint = i%2==0?0:1;
		}
	}
}
