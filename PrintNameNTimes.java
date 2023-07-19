package recursion;


//print your name till N Times
public class PrintNameNTimes {
	int count = 0;
	public void printYourName(int number,String name) {
		if(count <number) {
			System.out.println(name);
			count = count+1;
			printYourName(number,name);
		}else {
			return;
		}
		
	}
	public static void main(String[] args) {
		int numberOfTimes = 5;
		String name = "Jay Jagannath";
		PrintNameNTimes p = new PrintNameNTimes();
		p.printYourName(numberOfTimes,name);
	}
}
