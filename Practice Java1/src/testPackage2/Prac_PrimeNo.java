package testPackage2;

public class Prac_PrimeNo {
	
	// prime no the no that is divisible by Itself and 1 only
	
	
	public void PrimeNoPrac() {
		
		int count =0;
	for(int i =0;i<=20;i++)
	{
		for(int j=1;j<=20;j++)
		{
			if(i%j==0) 
			{
				count++;
			}
		}
		
		if(count==2)
		{
		System.out.println("This is prime No :- "+count);	
		}
	}
	}
}
