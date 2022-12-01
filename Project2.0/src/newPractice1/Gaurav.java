package newPractice1;

public interface Gaurav {
	
	void gn1();
	
	void gn2();
	
	static void gn() {
		System.out.println("This is normal static gn method in interface");
	}

	
	public static void main(String[] args) {
		gn();
		
		Gaurav obj =new GnImplements();
		
		//obj.gn1().gn3();
	}
}
