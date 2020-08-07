import java.util.Scanner;
public class Factorial_R {
	
	public static int findFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		System.out.print(num + "|");
		return num * findFactorial(num - 1);
	}
	
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Result: " + findFactorial(n));
	}
}
