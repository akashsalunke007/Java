package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NetCracker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int s = sc.nextInt();
		
		int a[][]= new int [s][s] ;
		
		for (int i = 0; i < a.length; i++) {
			for(int j = 0 ; j<a.length;j++)
			a[i][j] = sc.nextInt();
		}
		
		ArrayList<Integer> l1 = new ArrayList<>();
		
		
		for (int i = 0; i < a.length; i++) {
			for(int j = 0 ; j<a.length;j++) {
				
			l1.add(a[i][j]);
			}
		}
		
		Collections.sort(l1);
		
		System.out.println(l1);
		
		int count = 0;
		int maxCount = 0;
		
		for (int i = 0; i < l1.size()-1; i++) {
			if(l1.get(i+1)==l1.get(i)+1)
			{
				count++;
				if (count>maxCount) {
					maxCount=count;
				}
			}
			else {
				count = 0;
			}
		}
		System.out.println(maxCount);
		
	}

}
