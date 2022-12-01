package testPackage2;

import java.util.Scanner;

public class ProgramPractice {
	
	public void pracPrimeNo() {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that how much u want to find PM.");
		int A = sc.nextInt();
		
		int count=0;
		
		int z=1;
		
		for(int i=1;z<=A;i++){
			
			for(int a =1;a<=i;a++) {
				
				if(i%a==0) {
				
				count++;
				
				}	
			}
			if(count==2) {
				z++;
				System.out.println(i+" -The number is prime no");
			}
			
			count=0;
		}
		
	}
 
	public void RevString () {
		
		String A = "Gaurav";
		int Z = A.length();
		char D = 0;
		for(int i = Z-1;i>=0;i--) {
			 D = A.charAt(i);
			 System.out.print(D);
		}
		
	}
	
	public void PalendromeString() {
		
		String Gn = "Teneo";
		int A = Gn.length();
		
		String M = "";
		
		for(int z=A-1;z>=0;z--) {
			
			char G = Gn.charAt(z);	
			M=M+G;
		}
		if(Gn.toLowerCase().equals(M.toLowerCase()))
		{
	         System.out.println(Gn +":- String is palendrome String");
		}
		else 
		{
			System.out.println(Gn+":- Is not a palendrome String");
		}
	}
	
	public void PalendromeNo() {
		
		int A = 12321 ;
		
		
		
	}
	
	
	public static void main(String[] args) {
		ProgramPractice G = new ProgramPractice();
	//	G.pracPrimeNo() ;
	//	G.RevString();
		G.PalendromeString();
	}
}
