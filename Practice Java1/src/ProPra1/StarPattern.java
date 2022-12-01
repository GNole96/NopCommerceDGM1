package ProPra1;

import java.util.Scanner;

public class StarPattern {
	
	public void StarPatterns (){
		
		Scanner in=new Scanner(System.in);
	System.out.println("Enter n value to print Star ");
	int n=in.nextInt();
	
	
		int i,j,k;
		int x = n/2;
		
		for(i=n;i>x;i--)
		{
			for(k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		for(i=0;i<n/2-3;i++)
		{
			for(k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	
		for(i=n/2-3;i>=0;i--)
		{
			for(k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
        	for(i=x+1;i<n;i++)
               	{
		for(k=0;k<i;k++)
		{
			System.out.print(" ");
		}
		for(j=i;j<n;j++)
		{
			System.out.print("* ");
		}
		System.out.println(" ");
	}

}

	
	
	public void CirclePattern() {

		int n = 12 ;
		int i,j,k;
		int x = n/2;
		
  	for(i=n;i>x;i--)
		{
			for(k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	
	
	for(i=0;i<n;i++)
   	{
for(k=0;k<i;k++)
{
System.out.print(" ");
}
for(j=i;j<n;j++)
{
System.out.print("* ");
}
System.out.println(" ");
}

}
	/*	Scanner in=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=in.nextInt();
		
		for (int i = -n; i <= n; i++)   // -3
		{
            for (int j = -n; j <= n; j++)  // 
			{
                if (i*i + j*j <= n*n) // 9+4<=16
                	
					System.out.print("* ");
                else 
					System.out.print("  ");
            }
            System.out.println();
        }
	}
	*/
	
	
	
	/*public void Star() {
		
		System.out.println();
		System.out.println();
		System.out.println();
		int i,j,K,l,m,n;
		
		for( i=5;i>=0;i--) {
			for( j=0;j<=i;j++) {
				
				System.out.print(" ");	
			}
			for( K=10;K>=i*2;K--) {
				System.out.print("@");	
			}
			
				for( m=1;m<=j;m++) {
					System.out.print(" ");
				}
			System.out.println();
	
	
				}
		for( i=1 ;i<=5;i++) {
		  for( K=0;K<=i;K++) {
			System.out.print(" ");
		}
		  for( m=10;m>=i*2;m--) {
				System.out.print("@");
			}
		  for( K=0;K<=i;K++) {
				System.out.print(" ");
			}
		  
		  System.out.println();
			
		}
		
	}
	
	public void Diya () {
		
	int a,b,c,d,e,f,g ;
		
		for(a=6;a>=1;a--)
		    {
			for(b=1;b<=a;b++) {
				System.out.print("*");
				}

			for(c=12;c>=2*a;c--) {
					System.out.print("*");
				}
				for(e=1;e<=2*a;e++){
					
				System.out.print("*");
				
				}
				for(c=12;c>=2*a;c--) {
					System.out.print("@");
				}
				for(e=1;e<=2*a;e++){
					
					System.out.print("*");}
				for(c=12;c>=2*a;c--) {
					System.out.print("*");
				}
  for(e=1;e<=a;e++){
					
					System.out.print("*");}
			System.out.println();
			}
		
			for(a=1;a<=6;a++)
		    {
			for(b=1;b<=a;b++) {
				System.out.print("*");
				}

			for(c=12;c>=2*a;c--) {
					System.out.print("*");
				}
				for(e=1;e<=2*a;e++){
					
				System.out.print("*");
				
				}
				for(c=12;c>=2*a;c--) {
					System.out.print("@");
				}
				for(e=1;e<=2*a;e++){
					
					System.out.print("*");
					
					}
				for(c=12;c>=2*a;c--) {
					System.out.print("*");
					}
for(e=1;e<=a;e++){
					
					System.out.print("*");
					
					}
			System.out.println();
			}
		
			  
			//System.out.println();
		 
		 
		 
		 

			for(a=6;a>=1;a--)
			    {
				for(b=1;b<=a;b++) {
					System.out.print("*");
					}

				for(c=12;c>=2*a;c--) {
						System.out.print("*");
					}
					for(e=1;e<=2*a;e++){
						
					System.out.print("@");
					
					}
					for(c=12;c>=2*a;c--) {
						System.out.print("@");
					}
					for(e=1;e<=2*a;e++){
						
						System.out.print("@");}
					for(c=12;c>=2*a;c--) {
						System.out.print("*");
					}
for(e=1;e<=a;e++){
						
						System.out.print("*");}
				System.out.println();
				}
			
				for(a=1;a<=6;a++)
			    {
				for(b=1;b<=a;b++) {
					System.out.print("*");
					}

				for(c=12;c>=2*a;c--) {
						System.out.print("*");
					}
					for(e=1;e<=2*a;e++){
						
					System.out.print("*");
					
					}
					for(c=12;c>=2*a;c--) {
						System.out.print("*");
					}
					for(e=1;e<=2*a;e++){
						
						System.out.print("*");
						
						}
					for(c=12;c>=2*a;c--) {
						System.out.print("*");
					}
for(e=1;e<=a;e++){
						
						System.out.print("*");
						
						}
				System.out.println();
				}
			
				  
				System.out.println();
	}
		*/
	
	
	
	
	
	public static void main(String[] args) {
		
		StarPattern g=new StarPattern ();
		
	   g.StarPatterns();
	//  g. CirclePattern();
		//g.Star();
		//g.Diya();
	}

}
