package Assignments;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class SteDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		duplicateCount(str);
	}
	
	
	
	public static void duplicateCount(String s) 
	{
		
		char[] c = s.toCharArray();
		
		String st = "";
		int count = 1;
		
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) 
			{
				count = 1;
				char ch = ' ';
				
				if (st.indexOf(c[i]) == -1 && c[i] == c[j]) 
				{
					count ++;					
				}
			}
			
			if (st.indexOf(c[i]) == -1)
				{
					System.out.println(c[i]+" Occured "+count+" Times");
					st = st+c[i];
				}
			
		}
		
		
		
	}

}
