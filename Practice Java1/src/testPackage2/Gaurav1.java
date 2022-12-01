package testPackage2;

public class Gaurav1  {
	
	public int G = 20;
	int g = 10;
	
	public static void grn(){
		int a,b,c,d;
		for(a=1;a<=5;a++) {
			for(b=1;b<=a;b++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
	
	public void pankaj() {
		int a = 5;
		int b = 10;
		int c = a + b ;
		System.out.println(c);
		System.out.println();
	}
	
	public static void main(String[]agrs) {
		Gaurav1 AA = new Gaurav1();// object calling for non static method 
		AA.pankaj();
		
		grn();  // no need to call object. we can directly call to object in same class 
		 
		System.out.println(AA.G);
		
		System.out.println();
		
		//Class.upperSpace();//Cannot called non static method in other package unless the method is not public.
		//Class.invertedTrapezium();
	}
	}
