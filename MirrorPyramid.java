package examples;

public class MirrorPyramid {
	public static void main(String[] args) {
		int height = 8;
		int halfOfTheHeight = height/2;
		int pyramidHeight = height/2;
		for(int j=0;j<=halfOfTheHeight;j++) {
			for(int i=0;i<halfOfTheHeight-j;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<j*2+1;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
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
