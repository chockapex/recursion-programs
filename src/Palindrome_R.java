import java.util.Scanner;

public class Palindrome_R {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println("Result: " + (isPalindrome(s, 0, s.length() - 1)));
	}
	
	public static boolean isPalindrome(String s, int front, int rear) {
		if(front >= rear) {
			return true;
		}
		if(s.charAt(front) == s.charAt(rear)) {
			return isPalindrome(s, front + 1, rear - 1);
		}
		return false;
	}
}
