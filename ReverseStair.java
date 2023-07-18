package examples;

public class ReverseStair {
	public static void main(String[] args) {
		int pyramidHeight = 5;
		for(int i=0;i<=pyramidHeight/2;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=pyramidHeight/2;i>=0;i--) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
