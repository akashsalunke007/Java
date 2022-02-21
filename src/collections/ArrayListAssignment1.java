package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAssignment1 {
	public static void main(String[] args) {
		
		ArrayList<String> fruites = new ArrayList<>();
		boolean ch = true ;
		
		Scanner sc = new Scanner(System.in); 
		
		while (ch) {
			
			System.out.println("Enter Fruit To Add");
			String fr = sc.next();
			
			fruites.add(fr);
			System.out.println(fr+" Added In List ");
			System.out.println(fruites);
			
			System.out.println("\n\nDo you Want To Add More : (Y/N)");	
			char c = sc.next().charAt(0);
			
			if(c=='n' || c=='N')
				ch = false ;
			
			
		}
		
		
		
		
		
		
		System.out.println("\nEnter Fruits to check in Your List");
		String search = sc.next();
		
		if (fruites.contains(search)) {
			System.out.println(search+" Is Present at Index "+fruites.indexOf(search));			
		}
		else {
			System.out.println("Not Present In The List");
		}
	}

}
