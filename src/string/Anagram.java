package string;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String str2 = sc.nextLine();
		
		
		
		boolean b = false ;
		
		
		
		if (str1.length() == str2.length()) {
			
			for (int i = 0; i < str1.length(); i++) {
				
								
				if(str2.indexOf(str1.charAt(i)) == -1)
				{
					
					System.out.println("Not Possible Annagram");
					break ;
				}
				b = true ;				
			}
			
			
			if (b) {
				System.out.println("Possible Annagram");		
			}
			
			
		}
		
		
		else {
			System.out.println("Not Possible Annagram");
		}
		
		
		
	}

}
