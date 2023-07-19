package recursion;


public class PrintNumber1 {
	public void print(int number, int target) {
		if(number<target) {
			System.out.println(number);
			print(number+1,target);
		}else {
			return;
		}
	}
	public static void main(String[] args) {
		int number = 0;
		int target = 5;
		PrintNumber1 p = new PrintNumber1();
		p.print(number,target);
				
	}
}
