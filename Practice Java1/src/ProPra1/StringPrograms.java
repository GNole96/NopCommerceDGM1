package ProPra1;

import java.util.Random;
import java.util.Scanner;

public class StringPrograms {
	
	
	    public void ReverseWordByWord (){
		
			String q = "Java Concept Of The Day";
			
			String[] s = q.split(" ");
			
			int a = s.length-1;
			
			for(int i =a; i>=0; i--)
			{
				System.out.print(s[i]+" ");
				
			}
		}
	
	
	    public void RemoveDuplicate () {
		
		String s = "gauravfsadasgaurav";
	      String s2 = "";
	      for (int i = 0; i < s.length(); i++) {
	          Boolean found = false;
	          for (int j = 0; j < s2.length(); j++) {
	              if (s.charAt(i) == s2.charAt(j)) {
	                  found = true;
	                  break; 
	              }
	          }
	          if (found == false) {
	            s2 = s2+ s.charAt(i);
	          }
	      }
	      System.out.println(s2);

	}
		
	    public void RemoveAlphabet() {
		
		String s = "d5de5dd56d5dd";
		String z = "";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				z = z + s.charAt(i);

			}

		}
		System.out.println("The numeric string is :" +z);

	}
	
		
        public void RemoveNumbersSTR() {
			String s = "d5de5dd56d5dd";
			String z = "";

			for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i))) {
					z = z + s.charAt(i);

				}

			}
			System.out.println("The numeric string is :" +z);

		}	

    	public  void ReverseString () {
    			
    					String q = "Java Concept Of The Day";
    					
    					int a = q.length();
    					
    					for (int i= a-1; i>=0; i--)
    					
    					System.out.print(q.charAt(i));
    					
    		
    		}
          

    	public void MaximumOccurring () {
    			
    			String s = "maharashtra";
    	        int count = 0;
    			
    			for (int i=0; i<s.length(); i++)
    			{
    				if (s.charAt(i)=='a')// to count the occurrance of character 'a' in the string
    				{
    					count = count +1;
    				}
    				
    			}
    			
    			System.out.println("The character a is available for "+count+ " times");
    			
    			
    	}

    	
    	public  void LargeSmallArrayNo (){
    		
    			  //numbers array
    			  int n[] = new int[]{55,32,45,98,82,11,9,39,50};

    			  //assign first element of an array to largest and smallest
    			  int sm = n[0];
    			  int lr = n[0];

    			  for (int i = 1; i < n.length; i++) {
    				  
    			   if (n[i] > lr)
    			    lr = n[i];
    			   
    			   else if (n[i] < sm)
    			    sm = n[i];
    			  }

    			  System.out.println("Largest Number is : " + lr);
    			  System.out.println("Smallest Number is : " + sm);
    			 }
    			
        public void AddIntegersInSTR () {
    		
    		
    			String s = "ab5ds51s2";
    			int a = 0;
    			String z = "";
    			for (int i = 0; i < s.length(); i++) {
    				if (Character.isDigit(s.charAt(i))) {
    				z= 	s.substring(i, i+1);
    				
    				a= a +Integer.parseInt(z);
    				
    				}
    			}
    			System.out.println("The numeric string is :" +a);	
    		}

    	
    	public void NumOfSpacesInSTR () {
    		 
    				String q = "Java Concept Of The Day";
    						int a = q.length();
    						int count=0;
    						
    						for (int i= a-1; i>=0; i--)
    							
    						{
    							if(q.charAt(i)==' ')
    							{
    								count++;
    							}
    						}
    						
    						System.out.println(count);
    						
    			
    					
    		
    		}
    	public void FibonaciiNum () {
    			
    			 int a=0,b=1,c;    
    			 System.out.print(a+" "+b);//printing 0 and 1    
    			
    					 for(int i=2;i<10;i++)//loop starts from 2 because 0 and 1 are already printed    
    					 {    
    					 c=a+b;    
    					  System.out.print(" "+c);    
    					  a=b;    
    					  b=c;    
    					 }

    	}
    	
        public void FindFactorial () {

    			  int a = 5;
    			  int f = a;

    			  for (int i = (a - 1); i > 1; i--) {
    				  
    			   f = f * i;
    			  }

    			  System.out.println("Factorial of " + a + " is " + f);
    			 }
    			
    	public void ArmstrongNum () {
    		
    			  int r,rev=0,temp;    
    			  int ori=153;//It is the number variable to be checked for palindrome  
    			  
    			  temp=ori; 
    			  
    			  while(ori>0){ 
    				  
    			   r=ori%10;  //getting remainder  
    			   rev=rev + (r*r*r);    
    			   ori=ori/10;    
    			  }
    			  
    			  if(temp==rev)    
    			   System.out.println("armstrong number ");    
    			  else    
    			   System.out.println("not armstrong");    
    			}  
    	
    	public void PalindromeNum (){  
    		   
    		  int r,rev=0,temp;    
    		  int ori=3553;//It is the number variable to be checked for palindrome  
    		  
    		  temp=ori; 
    		  
    		  while(ori>0){ 
    			  
    		   r=ori%10;  //getting remainder  
    		   rev=(rev*10)+r;    
    		   ori=ori/10;    
    		  }
    		  
    		  if(temp==rev)    
    		   System.out.println("palindrome number ");    
    		  else    
    		   System.out.println("not palindrome");     
    		}


    	public void PalindromeStr () {

    			    String s= "Malayalam", rs = "";
    			    
    			    int a = s.length();

    			    for (int i = (a - 1); i >=0; --i) {
    			      rs = rs + s.charAt(i);
    			    }

    			    if (s.toLowerCase().equals(rs.toLowerCase())) {
    			      System.out.println(s + " is a Palindrome String.");
    			    }
    			    else {
    			      System.out.println(s + " is not a Palindrome String.");
    			    }
    			  }
    	
    	public void LeapYear () {
    			
    			      int year;
    			      System.out.println("Enter an Year :: ");
    			      Scanner sc = new Scanner(System.in);
    			      year = sc.nextInt();

    			      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
    			         System.out.println("Specified year is a leap year");
    			      else {
    			         System.out.println("Specified year is not a leap year");
    			   }
    	}
    		
    	public void RandomNumMaxRange () {
    		   
    		        int maxRange;

    		        //create objects
    		        Scanner SC = new Scanner(System.in);
    		        Random rand = new Random();
    		        
    		        System.out.print("Please enter maximum range: ");
    		        maxRange=SC.nextInt();
    		        
    		        for(int a=1; a<=10; a++)
    		        {
    		            System.out.println(rand.nextInt(maxRange));
    		        }
    	}
	
	
    	
    	public static void main(String args[]){
    		
		StringPrograms g = new StringPrograms();
		
		//g.LargeSmallArrayNo();
		//g.ReverseWordByWord();
	g.FibonaciiNum();
    	}
    	}
