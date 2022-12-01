package ProgramsPractice;

import org.testng.annotations.Test;

public class ProPracPrimeNo {

	@Test
	public void PrimeNo01() {
		
		int count =0;
		for(int i =0;i<=20;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2) 
			{
				System.out.println("This is Prime No :- "+ i);
			}
			count=0;	
		}
		
	}
	
	@Test
	public void PrimeNo02() {
		int x=20;
		int count =0;
		int z=1;
		for(int a=0;z<=x;a++)
		{
			for(int b=1;b<=a;b++)
			{	
				if(a%b==0)
				{
					count++;
					
				}	
			}
		if(count==2) 
		{
			System.out.println("this is prime No:- "+a);
			z++;
		}	
		count=0;
		}
	}
	
}
