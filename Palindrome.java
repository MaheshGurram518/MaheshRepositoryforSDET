package StringPackage;

public class Palindrome {
	 public static void main(String[] args) {
	        String str="liril";
	        int len=str.length();//calculating length of string
	        
	        char[] ch=new char[len];
	        
	        for(int i=0;i<len;i++) {
	            ch[i]=str.charAt(i);
	            String str2=ch[i];
	        }
	        
	        for(int i=len-1;i>0;i--) {
	            System.out.print(ch[i]+" ");
	        }
	 if(str.equals(str2))
	System.out.println("Palindrome");
else
	System.out.println("Not Palindrome");
	 }
	}
