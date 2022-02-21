package Assignments;

import java.util.Scanner;

public class aMDOCS {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int s = sc.nextInt();
		
		String a[]= new String [s];
		
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.next();
		}
		
		System.out.println(str.substring(0, 3));
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(getSub(str, s, a[i]));
		}
		
		
	}

	
	private static int getSub(String str,int n, String arr) {
					
			if(str.indexOf(arr)>=0)
				return 1;
				else {
					return 0;
				}
		
		
	}

}








