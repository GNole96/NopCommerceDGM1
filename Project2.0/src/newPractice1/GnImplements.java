package newPractice1;

public class GnImplements implements Deepak {
	
	public void gn1() {
		System.out.println("1");
	}
	
	public void gn2() {
		System.out.println("2");
	}
	
	public void gn3() {
		System.out.println("3");
		}
	

	public void gn4() {
		System.out.println("4");
		}
	
	 public static void gn() {
		 
		 System.out.println("over rided static interface to class");
	}
	 
	 public static void main(String[] args) {
		GnImplements obj = new GnImplements();
		obj.gn2();
		 gn();
	}
}
