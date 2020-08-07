import java.util.Scanner;

public class Palindrome_I {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println("Result: " + isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		String ns = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			ns += s.charAt(i);
		}
		if(s.equals(ns)) {
			return true;
		}
		return false;
	}
}
