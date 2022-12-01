package TestPackage3;

public class accessSpecifire {
	
	
	accessSpecifire(){
		
		System.out.println("I am accesss specifire");	
		
	}
	
	 void gn() {
		System.out.println("a + b");
	}
	
	
	accessSpecifire(int a,int b){
		
		int c = a + b ;
		
	System.out.println(c);
		
	}

	accessSpecifire(String a , int b){
		  
		System.out.println(a +"   "+ b);	
		
	}
	
	public static void main(String[] args) {
		accessSpecifire z=new accessSpecifire("Gaurav" , 7);
		z.gn();
	//	accessSpecifire p= new accessSpecifire(4,6);
		
	}
}
