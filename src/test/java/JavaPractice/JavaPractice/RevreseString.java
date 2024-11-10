package JavaPractice.JavaPractice;

import org.testng.annotations.Test;

public class RevreseString {
	
//	public static void main(String[] args) {
//		
//		String str = "Automation";
//		
//		StringBuilder s =  new StringBuilder(str);
//		s.deleteCharAt(2);
//		s.append(" Testing");
//		
//		System.out.println(s);
//		
//		String strr =  new StringBuilder(str).toString();
//		System.out.println(strr);
//		
//	}
	
	@Test
	public void RevreseString() {
		String str = "Automation";
		StringBuilder s =  new StringBuilder(str);
		s.reverse();
		
		System.out.println(s);
	}
	
	@Test
	public void RevreseString1() {
		String str = "Automation";
		StringBuilder s =  new StringBuilder(str).reverse();
		//s.reverse();
		
		System.out.println(s);
	}

}
