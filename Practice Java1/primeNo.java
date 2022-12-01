package Practice01;

public class primeNo {
	
	public static void Gn() {
		
		String A = "Mom";
			
		String z = "";
		
			int B = A.length();
			
			for(int i=B-1;i>=0;i--) 
			{
			z = z+ A.charAt(i);	
			}
			if(A.toLowerCase().equals(A.toLowerCase()))
			{
				System.out.println(A + ": Is a Palendrome String");
			}
			else {
				System.out.println(A + ": Is Not a Palendrome String");
			}
			
		}
	public static void main(String[] args) {
		
		Gn();
	}

}
