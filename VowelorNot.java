package ConditionalPkg;
import java.util.Scanner;

public class VowelorNot {

		public static void main(String[] args) {
			
		System.out.println("Enter a characteru");
		Scanner sc = new Scanner(System.in);
	    char n=sc.next().charAt(0);
	    sc.close();
		switch (n) 
		{
	case 'a':
		System.out.println("Vowel");
	    break;
	case 'e':
		System.out.println("Vowel");
	    break;
	case 'i':
		System.out.println("vowel");
	    break;
	case 'o':
		System.out.println("vowel");
	    break;
	case 'u':
		System.out.println("vowel");
	    break;

	default:
		System.out.println("Entered character is consonent");
	}
	}
	}


