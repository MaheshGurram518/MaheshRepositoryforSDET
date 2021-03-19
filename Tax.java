package Buildingblocks;

public class Tax {
	public static void main (String args[])
	{
	Tax obj= new Tax();
	int ctc=100000;
	obj.getDeductions(ctc);
	System.out.println("deduction is 10% of ctc:"+obj.getDeductions());
	obj.getTaxSlab();
	obj.getTotalTax();
	obj.display();
	}
	
	public int getDeductions(int ctc)
	{
				int ded=10*(10/100*ctc);
				ded=ctc-ded;
				return (ded);
	}
	public String getTaxSlab(int ded)
	{
				String sl=(ded>10000)? "20%" :"10%";
				System.out.println("Taxslab is:"+sl);
				return (sl);
	}
	public int getTotalTax(int ctc)
	{
				int pf=1000, sd=2000;
				int tt1=pf+sd;
				int tt=tt1+ded;
								return (tt);
	}
	public int display(int tt)
	{
				System.out.println("Total Tax is:"+tt);
	}
}

