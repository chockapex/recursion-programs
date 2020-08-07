import java.util.ArrayList;
import java.util.Scanner;
public class Prime_Factorisation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		ArrayList<Integer> list = new ArrayList<Integer>();
		getPrimeFactors(list, num, 2);
		System.out.println("Result: " + list);
	}
	
	public static void getPrimeFactors(ArrayList<Integer> a, int num, int i) {
		if(num == i) {
			a.add(i);
			return;
		}
		if(num % i == 0) {
			a.add(i);
			getPrimeFactors(a, num/i, 2);
		}
		else {
			getPrimeFactors(a, num, i + 1);
		}
	}
}
