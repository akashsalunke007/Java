package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Wipro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		ArrayList<Character> a1 = new ArrayList<>();
		ArrayList<Character> a2 = new ArrayList<>();
		
		for (int i = 0; i < s1.length(); i++) 
		{
			a1.add(s1.charAt(i));
		}
		
		for (int i = 0; i < s2.length(); i++)   
		{
			a2.add(s2.charAt(i));
		}
		
		
		
		for (int i = 0; i < a2.size(); i++) 
		{
			a1.remove(a2.get(i));
		}
		
		for(Character c1 : a1)
		{
			System.out.print(c1);
		}
	}

}
