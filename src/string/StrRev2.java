package string;

import java.util.Scanner;

public class StrRev2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();		
		String capital = "";
		
		String word[] = name.split(" ");
		
		
		for (int i = 0; i < word.length; i++) {
			
			String s = word[i];
			
			for (int j = 0; j < s.length() ; j++) {
				
				if(j==0)	
				{
					capital = capital + capitalize(s.charAt(j));
					
				}
				else {
					capital = capital + capitalize2(s.charAt(j));
					
				}
				
				
				
				
			}
			
			capital = capital + " " ;
			
		}
		
		
		System.out.println(capital);
		
		
	}
	
	
	
	
	
	
	
	public static char capitalize(char c) {
		
		if(c>='a' && c<='z')
			c -= 32 ;
		
		return c ;
		
	}
	
public static char capitalize2(char c) {
		
		if(c>='A' && c<='Z')
			c += 32 ;
		
		return c ;
		
	}

}


