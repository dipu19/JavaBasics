package examples;

public class Pyramid {
	public static void main(String[] args) {
		int pyramidHeight = 5;
		for(int i=0;i<pyramidHeight;i++) {
			for(int j=0;j<pyramidHeight-1-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
