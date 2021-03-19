package collections;
import java.util.Map;
//import java.util.TreeMap;
import java.util.HashMap;

public class LearnMap {
public static void main(String[] args) {
	Map<Character,Integer> hm=new HashMap<Character,Integer>();
	String str="Mahesh";
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
	}
	
	/*
	hm.put("Key3:","Val3");
	hm.put("Key1:","Val1");
	hm.put("null:","Val3");
	hm.put("Key2:",null);
	System.out.println(hm);
    System.out.println(hm.get("Key1"));
    System.out.println(hm.size());
	for (String k : hm.keySet()) {
        
        System.out.println("Key: "+k);
        System.out.println("Value:"+ hm.get(k));    */
        
    }
}

