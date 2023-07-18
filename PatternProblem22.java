package examples;

public class PatternProblem22 {
 public static void main(String[] args) {
	 int value = 4;
	 int rows = 7;
	 for(int i=0;i<2*value-1;i++) {
		 for(int j=0;j<2*value-1;j++) {
			 int top = i;
			 int buttom = j;
			 int right = (2*value-2)-j;
			 int left = (2*value-2)-i;
			 int min1 = Math.min(top, buttom);
			 int min2 = Math.min(right, left);
			 int minFinal = Math.min(min2, min1);
			 System.out.print(value-minFinal);
		 }
		 System.out.println();
	 }
 }
}
