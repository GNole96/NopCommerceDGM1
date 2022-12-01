package testPackage2;


public class Gaurav {
	
	public static  void Gaurav1() {
	
	int factor = 0;
	
	for(int a=1; a<=10; a++)//1 2 3 4 5/5 
		{
			for(int b=1; b<=a; b++)//1,2,3,4,5,6
				{	
				 if(a%b==0)//5/1=0,5/2=1,5/3=2,5/4=1,5/5=0
				 	{
					 factor++;//2,3,4,
				 	}
				}
			 	if(factor==2)//condition is true the values print as prime number
			 		{
			 			System.out.println(a + "      :  is prime number");
			 			
			 		}
			 	/*else
			 		{
			 			System.out.println(a + "is  not prime number");
			 			
			 		}*/
			 	factor=0;
		}
			
}


void primeno1() { 
	    		for(int a=1;a<=100;a++){                      
	    			int s = 1;
	    			if(s==1){
	    				for(int i=2;i<a;i++){          // 2<1
	    					int k = a%i ;
	    					if(k==0) {
	    						s=k;
	    					  break;
	    					}
	    			}
	    			}
	    			if(s!=0) {                    //s=1   
	    				System.out.println(a);
	    
	    			}
	    		}
	    	}
	     



	public static void main(String[]args){
		
	 	String z = "gn";
		
		z = "Gaurav";
		System.out.println(z);

		
		Gaurav1();
		
	
/*		Gaurav1 g = new Gaurav1();   //  by using object.
		
		Gaurav1.grn();// Good practice by calling with class name.
		g.grn(); // bad practice by calling with method name.in another class of same package.
		
		g.pankaj();	
		
		System.out.println(g.G);
		System.out.println(g.g);
		*/
      //  Gaurav obj = new Gaurav();
      //  obj.Kunal();
		
		
        
		
	}}
		
	

