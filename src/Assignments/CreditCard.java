package Assignments;

import java.util.Iterator;

public class CreditCard {
	
	
	
	public static void main(String[] args) {
		System.out.println(validateCreditcard("4321456789876541"));
	}
	public static boolean validateCreditcard(String str) {
		
		if (str.length()==13 || str.length()==16) {
			
			if (str.charAt(0)==4) {
	
				if (str.length()==13) {
					
					for (int i = 1; i < str.length(); i++) {
						if(str.charAt(i)>='1' && str.charAt(i)<='9')
						{
							continue;
						}
						else {
							return false;
						}
					}
					
					return true;
				}
				else if (str.length()==16) {
					
					
					for (int i = 1; i < str.length()-3; i++) {
						if(str.charAt(i)>='1' && str.charAt(i)<='9')
						{
							continue;
						}
						else {
							return false;
						}
					}
					
					
					for (int i = str.length()-3; i < str.length(); i++) {
						if(str.charAt(i)>='2' && str.charAt(i)<='6')
						{
							continue;
						}
						else {
							return false;
						}
					}
					return true ;
					
				}
				
				
			return false ;
			}
			return false;
			
		}
		else {
			return false;
		}
		
	}

}
