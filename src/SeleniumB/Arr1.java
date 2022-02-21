package SeleniumB;

import java.util.Scanner;

public class Arr1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size Of Array");
		int s = sc.nextInt();
		
		int []a = new int [s];
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt(); 
		}
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		
		System.out.println(sum);
	}

}
