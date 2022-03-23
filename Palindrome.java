package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		

		
		String word="madam";
		
		String word1="";
		
		for (int i = word.length()-1; i >=0; i--) {
			
			
			word1=word1+word.charAt(i);
			
			
		}System.out.println(word1);
		
		if(word.equals(word1))
			
			System.out.println("Palindrome");
		else
			System.out.println("not a palindrome");
		
	}

}
