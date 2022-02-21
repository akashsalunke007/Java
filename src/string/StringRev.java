package string;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		int count1 = 0;
		String s = "" ;
		
				
		for (int i = 0; i < ch.length; i++) {
			
			int count2 = 0;
			char c = str.charAt(i);
			
			
			
				if (s.indexOf(c) == -1) {
						
						for (int j = 0; j < ch.length; j++) {
							
							if (ch[i]==ch[j]) {
								count2++;
							}
							
						}
						
						if(count2>=1 && count2 % 2 != 0)
						{
							count1++;
						}
						
						s = s + ch[i];
					
				}
			
			else {
				continue ;
			}
			
			
		}
		
		
		if (count1 == 0 || count1 == 1) {
			System.out.println("Its Possible to form Palindrome");
			
		}
		else {
			System.out.println("Not Possible");
		}
		
		

		
	}

}
