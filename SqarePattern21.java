package examples;

public class SqarePattern21 {
  public static void main(String[] args) {
	  int rows = 5;
	  for(int i=0;i<rows;i++) {
		  //print *
		  for(int j=0;j<rows;j++) {
			  if(i==0||j==0||i==rows-1||j==rows-1) {
				  System.out.print("*");
			  }else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println("");
	  }
  }
}
