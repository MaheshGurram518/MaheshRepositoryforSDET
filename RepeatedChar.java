package StringPackage;

public class RepeatedChar {
public static void main(String[] args) {
	String str1="liril";
	int count=0;
	 char[] ch=new char[str1.length()];
	for(int i=0;i<str1.length();i++)
		 {
	    ch[i]=str1.charAt(i);
        String str2=ch[i];   
		 
		if (ch[i].equals(str1[i]))
	         {
	         count=count+1;
	         }
		
	      	
}
}
}