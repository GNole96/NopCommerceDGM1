import java.util.Scanner;

public class gaurav {
	
	public void PrNo1() { // My own modified  program of prime no.
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter how many prime no you want to find");
		
		int x = sc.nextInt();
		int count = 0;
	    int z = 1; 
		for(int a = 1;z<=x;a++) {
			for(int b=1;b<=a;b++) {
				
				if(a%b==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("This is Prime NO "+ a);
				
				z++;
			}
			count = 0;	
		}
	}
	
	  void pm() { // to find n no of prime no
		   
		  int count = 0;
		  int z=1;
		  
		  for(int a=1;z<=5;a++) {  //  5 
			  for(int b = 1;b<=a;b++) { // 123 45
				  
				  if(a%b==0) { //0,1,2,1,0
					  
					  count++; // 
					  
				  }
			  }
			  if(count==2) {
				  
				  System.out.println("prime no :"+ a);
				  
				  z++;
			  }
			  count = 0;
		  }
	  }
	
	
	void pmWithBreak() {
			 
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
				}}
		}
		///////////////////////////////////////////////////
	

}
