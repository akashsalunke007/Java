package Assignments;

import java.security.PublicKey;

public class khot {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int n = a.length;
		
		subs(n-1,a, 7);
		
		
	}

	
	private static boolean subs(int n,int a[] , int s) {
		
		int sum ;
		
		for (int i = 0; i <= n; i++) {
			sum = 0;
			for (int j = i; j <= n; j++) {
				
				sum = sum+a[j];
				if (sum==s) {
					return true ;
					
				}
				else if(sum>s) {
					break ;
					
				}
				
			}
			
			if (sum==s) {
				
				return true ;
				
			}
		}
		return false;
		
	}
	
	
	
	

}
