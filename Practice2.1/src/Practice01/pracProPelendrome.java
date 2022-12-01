package Practice01;

import java.util.Scanner;

public class pracProPelendrome {
	
	public void pelindromeString() 
	{
	
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter the String to check palendrome");
		String m = scr.nextLine();
		
	int G =m.length();            
	String rev ="";
	for(int i = G-1;i>=0;i--)  
	{
		rev=rev+ m.charAt(i);
	}
	System.out.println(m);
	System.out.println(rev);
	if(rev.equalsIgnoreCase(m)) 
	{
		System.out.println(m +" is Palendrome String");
	}
	else
	{
		System.out.println(m+" is not a palendrome String");
	}
	
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public void palendromeNumber()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input your number to identify weather it is palendrome or not ");
		int N = sc.nextInt();
		
		int b=0;         // 121/10=1 , 
		int a=0 ; 
		int OrN = N;
		
		while(N>0) {
				
			a= N%10;        //  1,2,1
	        b =(b*10)+a;    //  1, 10+2=12,  120+121
	        N=N/10;         //  121= 12.1 , 1.2
		}
		if(OrN==b)
		{
			System.out.println(OrN+" palendrome number ");
		}
		else 
		{
			System.out.println(OrN+" This is not palendrome ");
		}
		}
	

	
public static void main(String[] args) {

	pracProPelendrome g = new pracProPelendrome();
	// g.pelindromeString();
	g.palendromeNumber();


}
}