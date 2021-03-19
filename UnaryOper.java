package Buildingblocks;

public class UnaryOper {
	
	public static void main(String[] args) {
	       int n1 = 4, n2 = 5;
	        int n3 = n1++ + ++n2;
	        System.out.println(n3);
	        n3 = n1++ + ++n2;
	        System.out.println(n3);
	        int n4 = (++n1 + n2++) + n1;
	        System.out.println(n4);
	        int n5 = (++n1 + n2++) + n2;
	        System.out.println(n5);
	        int n6 = n2 + (++n1 + n2++);
	        System.out.println(n6);

	
	}

}
