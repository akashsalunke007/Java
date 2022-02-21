package Assignments;

import java.util.Scanner;
public class CvvValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(validateCVV(str));	
	}
	
	public static boolean validateCVV(String cvv) {
	int count=0;	
		
		if(cvv.length()==2 || cvv.length()==3)
		{
			for (int i = 0; i < cvv.length(); i++) 
			{
				if(cvv.charAt(i)>=51 && cvv.charAt(i)<=57)
				{
					count++ ;
				}
			}	
		}
		
		if(count==cvv.length())
		{
			return true ;
		}
		return false;	
	}
}
 