package ProPra1;
import java.util.Scanner;
public class palenString {

Scanner sc = new Scanner(System.in);

public void Gn() {
		
	String A = "Mom";
		
	String z = "";
	
		int B = A.length();
		
		for(int i=B-1;i>=0;i--) 
		{
		z = z+ A.charAt(i);	
		}
		if(A.toLowerCase().equals(A.toLowerCase()))
		{
			System.out.println(A + ": Is a Palendrome String");
		}
		else {
			System.out.println(A + ": Is Not a Palendrome String");
		}
		
	}
	
	public void factorial() { // 5! = 5*4*3*2*1 = 120
		System.out.println("Enter a number for find factorial");
		int a = sc.nextInt() ;
		
		int fact = 1;
		for(int i=1;i<=a;i++)
		{
			fact = fact*i ;	
		}
		System.out.println(fact + " :is a factorial of "+ a);
	}
	
	public void rev() {
		
		String a = "Gaurav is good a person with kind temperment";
		int b = a.length(); // for
		char z ;
		char s = ' ';
		int count=0;
		for(int i=0;i<=b-1;i++) {
			//System.out.println(a.charAt(i));
			 z = a.charAt(i);
		      if(z==s) 
		      { 
			count++;
		      }
		}
		System.out.println("space count in given string are "+ count);
	}
	public static void main(String[] args) {
		palenString G = new palenString();
		// G.Gn();
		//G.factorial();
		G.rev();
		
	}
}
