package Assignments;

import java.util.Scanner;

public class Hitachi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String res = s ;
		
		for (int i = 0; i < s.length(); i++) 
		{
			res = res.replace("89", "");
			res = res.replace("98", "");
			
		}
		
		
		System.out.println(res.length());
	}

}
