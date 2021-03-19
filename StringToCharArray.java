package StringPackage;

public class StringToCharArray {

	    public static void main(String[] args) {
	        String str="AbCdefGHijklMNOpqRstUVwxyZ @%*";
	        int len=str.length();//calculating length of string
	        
	        char[] ch=new char[len];
	        
	        for(int i=0;i<len;i++) {
	            ch[i]=str.charAt(i);
	        }
	        
	        for(int i=0;i<len;i++) {
	            System.out.print(ch[i]+" ");
	        }
	        
	    }
	}
