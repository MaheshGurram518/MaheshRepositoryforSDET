	package collections;

	import java.util.LinkedList;
	import java.util.List;
	import java.util.Vector;
	import java.util.ArrayList;
	public class LearnSet {

		public static void main(String[] args) {
			List<String> a1=new ArrayList<String>();
			a1.add("ABC");
			a1.add("CBC");
			a1.add(null);
			a1.add("");
			a1.add(2, "yrs");
			a1.set(2, "123");
			System.out.println(a1);
			
			for (String string:a1)
			{
			System.out.println(string);
			}
			Iterator<String> itr = s1.iterator();
	        while (itr.hasNext()) {
	            String string = (String) itr.next();
	            System.out.println(string);
	            
	        }
		}
	}


