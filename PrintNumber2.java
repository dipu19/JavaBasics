package recursion;

public class PrintNumber2 {
	public void print(int number,int target) {
		if(target>number) {
			System.out.println(target);
			print(number,target-1);
		}
	}
	public static void main(String[] args) {
		int number = 0;
		int target = 5;
		PrintNumber2 p = new PrintNumber2();
		p.print(number,target);
	}
}
