package Assignments;

import java.util.Scanner;

public class Capgemini1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(uCount(s));
	 
	}
	
	
	
	public static int uCount( String s) {
		
		String str = "";
		int count = 0 ;
		
		for (int i = 0; i < s.length(); i++) {
			
			if (str.indexOf(s.charAt(i)) == -1) {
				
				count++ ;
				str = str + s.charAt(i);
				
			}
		}
		
		return count ;
		
	}

}
