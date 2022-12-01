package ProgramsPractice;

import org.testng.annotations.Test;

public class ProPracPelindromeNo {
	
// this is palendrome String = TENET
	public void pelindromeNo() {
		
	}
	
	@Test
	public void palendromeString() {
		
		String a = "Tenet";
		int b = a.length();
		String rev = "";
		for(int i=b-1;i<=0;i++) {
			
			rev=rev+a.charAt(i);
			System.out.println(rev);
		}
		
	}
}
