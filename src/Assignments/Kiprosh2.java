package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Kiprosh2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int []num2 = intToArr(num);
		
		
		
		
		int i = 0;
				
		for (i = num2.length-1 ; i > 0; i--) 
		{
			if (num2[i]>num2[i-1]) 
			{
				break ;
			}
			
		}
		
		
		
		
		if (i == 0) 
		{
			
			System.out.println("-1");
		}
		else 
		{
			int n = num2[i-1] ,min = i;
			
			for (int j = i+1 ; j < num2.length; j++) 
			{
				
				if (num2[j]> n && num2[j]<num2[min]) 
				{
					
					min = j ; 
				}		
			}
			
			swap(num2, i-1, min);
			
			Arrays.sort(num2,i,num2.length);
					
			System.out.println(arrToInt(num2));
		}	
	}
	
	public static void swap(int[]a ,int i,int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	public static int[] intToArr(int n) 
	{
		
		int temp = n ;
		int count = 0 ;
		
		while (temp>0) 
		{
			count++ ;
			temp /= 10 ;
		}
		
		int []a = new int[count];
		
		for (int i = a.length-1; i>=0; i--) 
		{
			 int val = n % 10 ;
			 a[i] = val ;
			 n /= 10 ;
		}
		
		return a;
		
	}
	
	public static int arrToInt(int []a) 
	{
		
		int num = 0 ;
		
		for (int i = 0; i < a.length; i++) {
			
			num = num * 10 + a[i] ;	
		}
		
		return num ;
		
	}

}
