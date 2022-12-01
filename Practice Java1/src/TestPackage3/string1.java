package TestPackage3;

public class string1 {
	
	public static void main(String[] args) {
		
	 //addition of string
		
	String a = "1";
	String b = "2";
	String c = "3";
	String d=a+b+c;
	System.out.println(d);
		     //01234567891234567890 
	String z= "Gaurav has no limits";
	int len = z.length(); 
	System.out.println(len);  
	
	for(int i = len-1;i>=0;i--){
		
		System.out.print(z.charAt(i));
	}	
  }
}
