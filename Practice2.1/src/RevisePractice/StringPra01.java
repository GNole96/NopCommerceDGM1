package RevisePractice;

public class StringPra01 {
	
	// multiple space count in string 
	
	public void spaceCount () {
		
	String M = "M a d h u u u u";
	int s = M.length();
	int count = 0;
	
	for(int i = 0;i<s;i++){
		
		if(M.charAt(i)==' '){
			 count ++;	
		}
	}
	System.out.println("count = "+ count);
	}
/////////////////////////////////////////////////////////////////////////////////////
	
	public void stringReverce() {
	String G = "Madhu is bad girl";
	int g = G.length();
	String rev = "";
	for(int i = g-1 ; i>=0;i--) {
		
		rev=rev+G.charAt(i);	
	}
	System.out.println(rev);
	StringBuffer B =new StringBuffer("Gaurav");
	System.out.println(B.reverse());
	StringBuilder b = new StringBuilder("Madhu");
	System.out.println(b.reverse());

	
	}
///////////////////////////////////////////////////////////////////////////////////
	
	public void dupliChar() {
		
		String s = "Gaurav want something";
		int a = s.length();
		int coun = 0;
		for (int i =0;i<a;i++) { //a
			for(int j =0;j<a;j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					coun++;
				}	
			}
			System.out.println(s.charAt(i) + "="+ coun);
			
		}
	}
	
	 public void revPra () {
		 
			String mb = "java concept of the day";
		
			String [] st = mb.split(" ");
			
			String rev = "";
			for(String z :st) {
				
				System.out.println(z);
				
				int c=z.length();
				/*
				StringBuffer v=new StringBuffer(z);
				System.out.print(v.reverse()+" ");
				*/
				
			String d = z ;
				for(int i = c-1;i>=0;i--)
				{	
					rev=rev+d.charAt(i);
				}
			}
			System.out.println(rev);
	 }
	
	 public void fabonacciSeries() {
		 int a=0;
		 int b=1;
		 int c; 
		 System.out.println(a);
		 System.out.println(b);
		 for(int i = 2;i<=10;i++) {
			 c=a+b;
			 System.out.println(c);
			 a=b;
			 b=c;
		 }
		 
	 }
	 
	 public void armstrongNo() {
		
		 int arm= 153;
		 int ori = arm;
		 int rev = 0;
		 int r=0;
		 
		 while(arm>0) {  //1
			 
			 r =arm%10; //10/121= 1
			 rev= rev+ (r*r*r);  //126+27=153
			 arm=arm/10;   //1
		 }
		 if(ori==rev) {
			 System.out.println("Armstrong No");
		 }else 
		 {
			 System.out.println("Not an Armstrong No");
		 }
	 }
	 
	 public void palendromNo() {
		 int ori = 122;
		 int act=ori;
		 int a,b = 0 ;
		 
		 while(ori>0) {
			 
			 a = ori%10;  //1 /2/ 1
			 b=a+(b*10);  //b=1+0=1 // 2+10=12 // 1+12*10=121
			 ori=ori/10;  //1.2.1 
		 }
		 if(act==b){
			 System.out.println("this is palendrome no");
		 }else 
		 {
			 System.out.println("this is not palendrome no");
			 }
	 }
	 
	
	 public void PrimeNo() {
		 
		 int count=0;
		 System.out.println("This is prime No :-1");
		 for(int i =1;i<=20;i++) {//7  /8
			 for(int j=1;j<=i;j++) { //0 1 2 3 4 5 6 7 8
				 
				 if(i%j==0) {
					 
					 count++; // 1   7 
					 
				 }
			 }
			 if(count==2) {
				 System.out.println("This is prime No :-"+ i );
			 }
		 count=0;
		 }
		 
	 }
	 
	 public void palendromeString() {
		 
		 String Ps = "Tenet";
		 String t = Ps;
		int s =  Ps.length();
		 String rev = "";
		 
		 for(int i = s-1;i>=0;i--){
			 
			 rev=rev+Ps.charAt(i);
		 }
		 if(t.toUpperCase().equals(rev.toUpperCase())) {
			 System.out.println(t+" is palendome string");
		 }else {System.out.println(t+" is not palendome string");}
	 }
	
	 
	 private String name;
	 
	 public void setName(String n) {
		 name = n;
	 }
	 
	 public String getName() {
		return name; 
	 }
	 
	 private int id;
	 
	 public void setId(int i) {
		 id = i;
	 }
	 public int getId() {
		 return id;
	 }
	 
	public static void main(String[] args){
		
		StringPra01 m = new StringPra01 ();
		//m.stringReverce();
	    //m.dupliChar();
		//m.fabonacciSeries();
		//m.PrimeNo();
		//m.armstrongNo();
		//m.palendromNo();
		//m.palendromeString();
		
		m.setName("Gaurav Nole");
		System.out.println(m.getName());
		
		m.setId(200);
		System.out.println(m.getId());
	}
	}

