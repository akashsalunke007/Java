package Assignments;

import java.util.Scanner;

public class EnY2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int []ar = new int[a]; 
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		
		int odd[] = new int[a];
		int even[] = new int[a];
		int oc=0;
		int ec=0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0)
			{
				even[ec]=ar[i];
				ec++;
			}
			else {
				odd[oc]=ar[i];
				oc++;
			}
		}
		
		int []result = new int[a];
		oc=0;
		for (int i = 0; i < result.length; i++) {
			if(i<ec)
			{
				result[i]=even[i];
			}
			else {
				result[i]=odd[oc];
				oc++;
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
