package string;

import java.util.Scanner;

public class StringRe {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		String str= sc.nextLine();
		
		String []name = str.split(" ");
		
		String rev = "";
		
		for (int i = 0; i < name.length; i++) {
			rev = name[i] +" "+ rev;
		}
		
		System.out.println(rev);
		
		
		
		
		String str2 =  rev(str);
		
		System.out.println(str2);
		
		
		
		String rev2 = "";
		
		
		for (int i = 0; i < name.length; i++) {
			
			rev2 = rev2 +" "+ name[i] ;
			
		}
		
		System.out.println(rev2);
		
	}
	
	
	
	
	
	
	public static String rev(String str) {
		
		String rev = "";
		
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev ;
		}
		return rev ;
		
	}

	

}
