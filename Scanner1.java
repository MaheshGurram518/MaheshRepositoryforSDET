package ConditionalPkg;
import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();

	System.out.println("Enter number is"+n);
}
}
