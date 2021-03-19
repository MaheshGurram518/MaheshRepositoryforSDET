package ConditionalPkg;

public class LargestNumber {

	public static void main (String args[])
	{
	double x1=1.0,x2=-4.5,x3=5.3;
	if (x1>x2)
	{
		if(x1>x3)
			System.out.println("Largest:"+x1);
	}

	else if(x2>x3)
			System.out.println("Largest:"+x2);
			
	else 
		System.out.println("Largest:"+x3);
}
}

