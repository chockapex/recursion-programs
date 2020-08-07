import java.util.Scanner;
public class Factorial_I {
	
	public static int findFactorial(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Result: " + findFactorial(n));
	}
}
