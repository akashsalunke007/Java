package SeleniumB;

import java.util.Scanner;

public class Arr3{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size Of Array");
		int s = sc.nextInt();
		
		int a1[] = new int[s];
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}
		
		int max = a1[0];
		
		for (int i = 0; i < a1.length; i++) {
			
			if(a1[i]>max)
			{
				max = a1[i];
			}
			
		}
		
		System.out.println("Maximum Value is : "+max);
	}

}
