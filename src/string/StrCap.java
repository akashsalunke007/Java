package string;

import java.util.Scanner;

public class StrCap {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		String str = sc.nextLine();
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			result = result + charCase(str.charAt(i));
			
		}
		
		System.out.println(result);		
	}
	
	

	public static char charCase(char c) {
		
		if( c>= 65 && c<=90)
		{
			c += 32;
		}
		else if (c>= 97 && c<= 122) {
			
			c -= 32;
		}
		
		return c ;
	}
		
		
		
	

}
