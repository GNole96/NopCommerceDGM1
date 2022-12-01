package ProPra1;
import java.util.Scanner;
public class palendrome1 {
	
	Scanner sc = new Scanner(System.in);
	   void pnr() {
		   System.out.println("please enter no to check weather its a palindrome or not  ");
		   int z = sc.nextInt();
		   
		int no = z;       //   1234321 , TENET
		int orno = no;
		
		int rev = 0;
		while (no > 0) { // 121, 12 1  0 
			
			rev = rev * 10 + no % 10 ;  //1 2 1
			
			no = no/10;    // 12,1,0  
		}
		if(orno==rev)
		{
			System.out.println(rev + " is palindrome No");
		}
		else
		{
			System.out.println(rev + " is not palendrome number");
		}
	   }
	   
	void PliDroNum() {
	    Scanner sc = new Scanner(System.in);
			 System.out.println("please enter no to check weather its a palindrome or not  ");
			  
			 int n = sc.nextInt();
			
		    int Onum = n;
	        int a,b=0;
	  
		while(n>0) { //121,12,1
			
			a=n%10;    //1 ,2, 1
			
			b=(b*10)+a; //1 ,12,121
		
			n=n/10; // 12.1 ,1 , 0.1
			
		}
		if(Onum==b) {
			System.out.println(b+" is a palindrome number" );
			
		}
		else {System.out.println(b+" is not a palendrome no ");
		}
	}
	
	public static void main(String[] args) {
	
		palendrome1 g = new palendrome1();
		g.PliDroNum();
	  //  g.pnr(); 
	    
	 
	   
	}
}
