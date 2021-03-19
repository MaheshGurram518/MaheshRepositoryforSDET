package Buildingblocks;

public class SwapWithoutThird {
	public static void main (String args[])
	{
	SwapWithoutThird obj= new SwapWithoutThird();
	obj.swap(1,2);
	System.out.println("a and b values:"+a);
	System.out.println("a and b values:"+b);
	public int swap(int a, int b)
	{
		a=a+b;
		b=a-b;
		return swap(a,b);
	}
}
}
