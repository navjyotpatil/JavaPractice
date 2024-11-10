package javaprograms;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "madam";
		//String str = "madamd";
		
		String sreverse = new StringBuilder(str).reverse().toString();
		//StringBuilder sreverse = new StringBuilder(str).reverse();  not working need to conver in string
		System.out.println(str);
		System.out.println(sreverse);
		System.out.println(str.equals(sreverse));
		
		if(str.equals(sreverse)) {
			System.out.println("String is palindrome ");
		}else {
			System.out.println("String is not palindrome ");
		}

	}

}
