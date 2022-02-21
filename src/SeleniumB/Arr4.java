package SeleniumB;

import java.util.Scanner;

public class Arr4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size Of Array");
		int s = sc.nextInt();
		
		int a1[] = new int[s];
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}
		
		int min = a1[0];
		int min_next = min ;
		
		for (int i = 0; i < a1.length; i++) {
			
			if(a1[i]<min)
			{
				min_next = min ;
				min = a1[i];
				
				
			}

			
		}
		
		System.out.println("The Second Minimum Value is : "+min_next);
	}

}
