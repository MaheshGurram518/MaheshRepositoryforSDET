package ConditionalPkg;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 10; i++) {
			int n1 = n * i;
			System.out.println(n + "*" + i + "=" + n1);
		}
	}
}
