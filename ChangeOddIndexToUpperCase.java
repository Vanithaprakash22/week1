package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	
		
		String test="changeme";
		
		//char ch[]=new char[test.length()];
		
		
		
		for (int i = 0; i < test.length(); i++) {
            
			char ch = test.charAt(i);
			
            
            //System.out.print(test.charAt(i) + " ");
            
            if (i % 2 == 0)
            {
                System.out.print(Character.toLowerCase(ch));
            } 
            else {
                System.out.print(Character.toUpperCase(ch));
            }
        }
		System.out.println();
		
        }

	}


