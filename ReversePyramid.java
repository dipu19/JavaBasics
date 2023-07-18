package examples;

public class ReversePyramid {
	public static void main(String[] args) {
		int pyramidHeight = 3;
		for(int i=pyramidHeight;i>=0;i--) {
			for(int j=0;j<pyramidHeight-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
