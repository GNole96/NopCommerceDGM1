package TestPackage3;

public class nonPrimetiveDT {
	public static void main(String[] args) {
		
	String f = "gaurav";	
	String g = "Gaurav"; // this is literal way of string writing.
	String a = "Maharashtra";	
	System.out.println(g.charAt(0)); 
	System.out.println(a.charAt(9));              // to get the value of particular index.
	System.out.println(a.length());               //to get the character length
	System.out.println(a.toUpperCase());          // to make the sentence in uppercase letters.
	System.out.println(a.toLowerCase());          // make the sentence in lowerCase letters.
	System.out.println(a.concat(" Mahabharat"));  //to add new string with existing string.
	System.out.println(a.substring(4));           //to create substring from given index.
	System.out.println(a.substring(0,4));         //to  find the character string with given index range.
	System.out.println(a.equals(g));              //to compare the two strings.
	System.out.println(f.equalsIgnoreCase(a)+"*");   
	System.out.println(a.contains(a));            //to find if character sequence present.
	
	String G = "Gaurav joined the velocity classes";
    int len = a.length();     
    int count = 0;//// 
    for(int i=len-1;i>=0;i--) 
    	if(a.charAt(i)==' ') 
    	{
    	count++;
    	}
    System.out.println(count);
    
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(a.indexOf("a"));
    		
    }	
}

