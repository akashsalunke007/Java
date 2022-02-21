package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class EnY3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count=0;
		
		int []ar = new int[a]; 
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		
		
		
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<0)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
