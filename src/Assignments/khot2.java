package Assignments;

import java.util.Iterator;
import java.util.Scanner;

public class khot2 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int r[] = {2,4,3,5,6};
		int b[] = {1,3,2,4,5};
		
		
		if (validation(r, b)) {
			System.out.println("valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		
		
		
	}
	
	public static boolean validation(int red[], int blue[]) {
	
		if (red.length >= blue.length) {
			int count = 0;
			for (int i = 0; i < blue.length; i++) {
				if(red[i]<blue[i])
				{
					break;
				}
				count++;
			}
			
			if (count==blue.length) {
				return true;
				
			}
			else {
				return false ;
			}
			
		}
		
		
		else{
			int count = 0;
			for (int i = 0; i < red.length; i++) {
				if(red[i]>blue[i])
				{
					break;
				}
				count++;
			}
			
			if (count==blue.length) {
				return true;
				
			}
			else {
				return false ;
			}
			
		}
		
	}
}
