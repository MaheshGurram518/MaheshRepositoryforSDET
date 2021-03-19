package ConditionalPkg;
import java.util.Scanner;

public class PrimeUsingForLoop {
	public static void main(String[] args) {

			System.out.println("Enter starting number");
			Scanner sc = new Scanner(System.in);
			int min = sc.nextInt();
			sc.close();
			int max= sc.nextInt();

			
		//			        int min = 0;
			//        int max = 99;
			        for (int i = min; i <= max; i++) {
			            if (i == 0 || i == 1)
			                continue;
			            boolean flg = true;
			            for (int j = 2; j <= i / 2; j++) {
			                if (i % j == 0) {
			                    flg = false;
			                    break;
			                }
			            }
			            if (flg == true)
			                System.out.print(i + " ");
			        }
			    }
			}

	
	

