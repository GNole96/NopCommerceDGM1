package ProPra1;

import java.util.Scanner;

public class MaxOcNo {
	

	
	 void method() {	
			String s ="uravvv is auuuuuurvvv and gaurv vvv ooooooooo";
			int a= s.length();
			int c = 0;
			int d=1;
			char u = 0;
		for(int i =0;i<a;i++) {    //6
			for(int b = 0;b<a;b++) {  // 
				if(s.charAt(i)==s.charAt(b)) {
					c++; // 1 	
				}
		}
			if(d<c && s.charAt(i) !=' ') {
		d=c;
		u=s.charAt(i);
		}
		c=0;
		}
		 System.out.println(d +" : num of times ");
		 System.out.println(u);
		 }
	 
	 
	static void g() 
	{System.out.println("hii");
		 }
	
	
	void datatype() {
		
	
		//DataTypes:
			boolean f = true;        //  it will take 1B
			byte  a  = 127;          //  it will take 1B  (Byte) 
			short b  = 32767 ;       //  it will take 2B
			char  e = 'G' ;          //  it will take 2B
			int   d = 999999999;     //  it will take 4B
			long  c = 999999999;     //  it will take 8B
			float g = 0.100000000f;  //  it will take 4B n gives up to 7 digits accuracy 
			double h = 0.1000000000; //  it will take 8B n gives up to 16 digit accuracy 
			
			
		// Operators = +  -  *  /
			
		int x = 50;
		float y = 5;
		
		System.out.println(x+y);
		System.out.println(x*y);
		System.out.println(x-y);
		System.out.println(x/y);
		
	
	

	// Relationals
			
			int ag = 20;
			float bg = 19f;
			
			System.out.println(a++);
			System.out.println(b++);
			System.out.println(a--);
			float cg = a+b;
			System.out.println(c);
			
			System.out.println(a);
			
			System.out.println(b);
			
			System.out.println(a>b);
			
			System.out.println((a>b) && (a<b)); 
			//                   f         f    =  f
			System.out.println((a>b) && (a==b));
			//                    f        t    =  f          ( T && T= T )OTHER RESULT ARE FALSE).
			System.out.println((a==b) && (a<b));
			//                    t         f   =  f
			System.out.println((a==b) && (a==b));
			//                    t         t   =  t
			
			//     FOR || OR RELATIONALS 
			
			System.out.println((a>b)  || (a<b)); 
			//                   f         f    =  f
			System.out.println((a>b)  || (a==b));
			//                    f        t    =  f          ( F || F= F )OTHER RESULT ARE TRUE).
			System.out.println((a==b) || (a<b));
			//                    t         f   =  f
			System.out.println((a==b) || (a==b));
			//                    t         t   =  t
			
			
			// INCREAMENTALS 
			
			a = 5;
			System.out.println(a++);
			System.out.println(a);
			
			System.out.println('G');
			String name  = "Gaurav";
			System.out.println("I am "+ name);
			
			a = 1;
			System.out.println(a++) ;
			System.out.println(a++) ; 
			System.out.println(a);
			System.out.println(--a);
			System.out.println(a--);
			System.out.println(--a);
			System.out.println(a++);
			System.out.println();
			System.out.println(a++);
			System.out.println(++a);
			System.out.println(a);
			
			//FINAL ANSWER WILL BE 7
	     
		}
	
	
	static void Gaurav() {
		
//		 String [] Gn = {" Gaurav"," Madhu"," Dipak"," Sima"};
//	  
//		// for(String xyz : Gn ) {
//			// System.out.println(xyz);
//			                                       // 123456
//			// int xz = xyz.length();                // Gaurav
//			                                       // 012345                                  
//			// System.out.println(xz);
//			 
//		//	 for(int i=xz-1;i>=0;i--) {
//				 
//				 System.out.print( xyz.charAt(i));
//				 }
//			 System.out.println();
//			 
		 }
	
	
	public void DC() {
		System.out.println("Enter num to find factorial");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=a;i++) {
			fact = fact * i;	
		}
		System.out.println("Factorial of entered num is :"+fact);
	}
	
	
	
	
	public static void main(String[] args) {
		MaxOcNo g = new MaxOcNo();
		//g.method();
		//System.out.println(g.d +" bar hai  "+g.u);
		//g();
		g.DC();
	}
	}

