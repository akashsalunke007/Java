package string;

import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		
		String str2 = sc.next();
		int count =0,count1=0;
		
		if (str1.length() == str2.length()) {
			
			for (int i = 0; i < str1.length(); i++) {
				
				for (int j= 0; j < str1.length(); j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
						count++;
					}
					
				}
				if(count>=1)
				{
					count1++;
				}
				
							
			}
			if(count1==str1.length())
			{
				System.out.println("ana");
			}
			else {
				System.out.println("no");
			}

	}
	}
}


