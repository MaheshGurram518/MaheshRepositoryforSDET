package collections;
	import java.util.Map;
import java.util.ArrayList;
//import java.util.TreeMap;
	import java.util.HashMap;
public class HashMapOfArrayList {
	
     public static void main(String[] args) {
		HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
		ArrayList<String> al= new ArrayList<String>();
		al.add("Mahesh");
		al.add("Yogi");
		hm.put("Name", al);
		System.out.println(hm);
		al=new ArrayList<String>();
		al.add("E01");
		al.add("E02");
		System.out.println(hm);
		for(String k:hm.keySet())
		{
			System.out.println("Key:"+k);
			System.out.println("Values:");
			ArrayList<String> a=hm.get(k);
			for(String val:a)
			{
				System.out.println(val);
				
			}
			System.out.println();
		}
		
	/*	String str="Mahesh";
				for(int i=0;i<str.length();i++)
					{
					char c=str.charAt(i);
					if(hm.containsKey(c))
						hm.put(c, hm.get(c)+1);
					else
						hm.put(c, 1);
					}
		for (Character k:hm.keySet())
		{
			System.out.println("key:"+k+" Value:"+hm.get(k));
		}    */
}
}
