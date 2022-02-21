package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AB1D {
	
	public static void main(String[] args) {
		
		
		ArrayList<AB1> books = new ArrayList<>();
		
	
			
		Scanner sc = new Scanner(System.in); 
		boolean ch = true;
		
		while (ch) {
			
			System.out.println("Enter Book To Add");
			String b = sc.next();
			
			System.out.println("Enter Book Price");
			int p = sc.nextInt();
			
			System.out.println("Enter Book Author To Add");
			String a = sc.next();
			
			
			books.add(new AB1(b, p, a)) ;
			
			System.out.println("\n\nDo you Want To Add More : (Y/N)");	
			char c = sc.next().charAt(0);
			
			if(c=='n' || c=='N')
				ch = false ;
			
		}
		
		
			
			for (int i = 0; i < books.size(); i++) {
				System.out.println(books.get(i).bname);
			}
			
	
		
		
		
	}

}
