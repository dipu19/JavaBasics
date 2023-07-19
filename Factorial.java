package recursion;

public class Factorial {
	public void factorial(int target) {
		int factorial = 1;
		while(target>0) {
			factorial = target*factorial;
			target = target-1;
		}
		System.out.println(factorial);
		return;
	}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.factorial(7);
	}
}
