package recursion;

public class PalindromeString {
	public void reverse(String str) {
		int count =0;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i) == str.charAt(str.length()-1-i)) {
				count = count+1;
			}
		}
		if(count == str.length()/2) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not an palindorme");
		}
	}
	public static void main(String[] args) {
		String str="ABCDE";
		PalindromeString p = new PalindromeString();
		p.reverse("tasat");
		
	}
}
