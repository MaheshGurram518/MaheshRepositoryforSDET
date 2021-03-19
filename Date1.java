package StringPackage;

public class Date1 {
	String str="sjshshvhsh1234.567scjsvhsvjvh";
	Date d = new Date();
	        SimpleDateFormat format=new SimpleDateFormat("MM/dd/yyyy");
	        String strDate=format.format(d);
	        System.out.println(strDate);
	        
	        format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	        strDate=format.format(d);
	        System.out.println(strDate);
	        
	        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
	        
	        Date d1;
	        try {
	            d1 = df.parse("31/12/2021");
	            System.out.println(d1);
	        } catch (ParseException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
}
