package StringPackage;

import java.io.FileInputStream;

public class ExceptionEx {

	public static void main(String[] args) {
		
	
	FileInputStream fi=null;
	fi=new FileInputStream(new File("Test.txt"));
	int n;
	while((n=fi.read()!=-1))
		
}
}
