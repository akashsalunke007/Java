package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AB2D {

	public static void main(String[] args) {
		
		ArrayList<AB2> songs = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean ch = true ;
		
		while (ch) {
				
				System.out.println("Enter Song Name To Add");
				String so = sc.next();
				
				
				System.out.println("Enter Singer Name");
				String si = sc.next();
				
				System.out.println("Enter Movie Name");
				String mv = sc.next();
				
				
				songs.add(new AB2(so, si, mv)) ;
				
				System.out.println("\n\nDo you Want To Add More : (Y/N)");	
				char c = sc.next().charAt(0);
				
				if(c=='n' || c=='N')
					ch = false ;
				
			}
		
		
		System.out.println("Enter the Song To Search");
		String search = sc.next();
		boolean flag = false ;
		
		for (int i = 0; i < songs.size(); i++) {
			
			if(songs.get(i).singer.equalsIgnoreCase(search))
			{
				System.out.println("Song Found...!  Details Given below");
				System.out.println("Song Name "+songs.get(i).song+"\nSong Singer is : "+songs.get(i).singer+"\nFrom Movie : "+songs.get(i).movie);
				flag = true ;
			}
			
			
		}
		
		if(!flag) 
		{
			System.out.println("Song Not Found");
		}
   
	}

}
