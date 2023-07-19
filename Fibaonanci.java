package recursion;

public class Fibaonanci {
	public void fibonanci(int number) {
		int number1 = 0;
		int number2 = 1;
		System.out.print(number1+" ");
		System.out.print(number2+" ");
		for(int i=1;i<number;i++) {
			int number3 = number1+number2;
			System.out.print(number3+" ");
			number1 = number2;
			number2 = number3;
		}
	}
	public static void main(String[] args) {
		int number = 7;
		Fibaonanci f  = new Fibaonanci();
		f.fibonanci(number);
	}
}
