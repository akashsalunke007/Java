package string;

import java.util.Scanner;

public class StringEachCount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int upperCase = 0 ;
		int lowerCase = 0 ;
		int conson = 0 ;
		int vowel = 0 ;
		int special = 0 ;
		int digit = 0 ;
		
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				upperCase++ ;
				
				if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') 
				{
					vowel++ ;	
				}
				else {
					conson++ ;
				}
				
			}
			else if (str.charAt(i)>=97 && str.charAt(i)<=122) 
			{
				lowerCase++ ;
				
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
				{
					vowel++ ;	
				}
				else {
					conson++ ;
				}
				
			}
			
			else if (str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				digit++ ;
				
			}
			else //if (str.charAt(i) != ' ')
			{
				special++ ;
			}
			
			
		}
		
		System.out.println("Uppercase Letters           : "+upperCase);
		System.out.println("Lowercase Letters           : "+lowerCase);
		System.out.println("Consonanat Count is         : "+conson);
		System.out.println("Vowels Count is             : "+vowel);
		System.out.println("Digit Count is              : "+digit);
		System.out.println("Special Characters count is : "+special);
	}

}
