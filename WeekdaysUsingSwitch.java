package ConditionalPkg;

import java.util.Scanner;

public class WeekdaysUsingSwitch {
	public static void main(String[] args) {
		
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
switch (n) 
{
Case1:
	System.out.println("Sunday");
    break;
Case2:
	System.out.println("Monday");
    break;
Case3:
	System.out.println("Tuesday");
    break;
Case4:
	System.out.println("Wednesday");
    break;
Case5:
	System.out.println("Thursday");
    break;
Case6:
	System.out.println("Friday");
    break;
Case7:
	System.out.println("Saturday");
    break;
default:
	System.out.println("invalidweek");
}
}
}
