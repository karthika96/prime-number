package primenumber;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		if (isPrime(n)) {
		System.out.println(n + " is a prime number.");
		} else {
		System.out.println(n + " is not a prime number.");
		}
		}
		public static boolean isPrime(int n) {
		if (n <= 1) {
		return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
		if (n % i == 0) {
		return false;
		}
		}
		return true;
		

	}

}
