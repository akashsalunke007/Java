package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookDriver {
	public static void main(String[] args) {
		
		ArrayList<PhoneBook> contacts = new ArrayList<>() ;
		Scanner sc = new Scanner(System.in);
		boolean flag = true ;
		
		
		while (flag) {
			
			System.out.println("Enter Contact Name :");
			String nString = sc.nextLine();
			
			System.out.println("Enter Contact Number :");
			long p = sc.nextLong() ;
			
			while (flag) {
				String p1 = p+"";
				if(p1.length()==10 && (p1.charAt(0)=='9'|| p1.charAt(0)=='8' || p1.charAt(0)=='7' || p1.charAt(0)=='6')  )
						flag = false ;
				else {
					System.out.println("Enter Valid Phone Number");
					p = sc.nextLong() ;
				}				
			}
	
			sc.nextLine();
			
			System.out.println("Enter Address");
			String aString = sc.nextLine();
			
			contacts.add(new PhoneBook(nString, p, aString));
			
			
			System.out.println("Do You Want To Add More Contacts :(Y/N)");
			char ch = sc.next().charAt(0);
			
			if(ch=='n' || ch=='N')
				flag = false ;
			else 
				flag = true; 
			
			sc.nextLine();
		}
			
		System.out.println("Enter Your Choice \n1   ----->   For Display All Contacts \n2   ----->   Search Contact For Details");
		int key = sc.nextInt() ;
		
		sc.nextLine();
		
		switch (key) {
		case 1:
		{
			
			System.out.println("________________________________________________________________");
			System.out.println("Contact Details Of Given Below");
			
			for (int i = 0; i < contacts.size(); i++) {
									
					System.out.println("________________________________________________________________");
					System.out.println("Name        : "+contacts.get(i).name);
					System.out.println("Phone No.   : "+contacts.get(i).pn);
					System.out.println("Address     : "+contacts.get(i).add);
					System.out.println("________________________________________________________________");
					
				}
			}
			
			break;
			
		case 2:
			
			flag = true ;		
			while (flag) {
				
				System.out.println("Enter Name To Search Contact And Add ");
				String searchString = sc.nextLine() ;
				
				for (int i = 0; i < contacts.size(); i++) {
					
					if (contacts.get(i).name.equals(searchString)) {
						
						System.out.println("________________________________________________________________");
						System.out.println("Contact Details Of "+searchString+" are Given Below");
						System.out.println("________________________________________________________________");
						System.out.println("Name        : "+contacts.get(i).name);
						System.out.println("Phone No.   : "+contacts.get(i).pn);
						System.out.println("Address     : "+contacts.get(i).add);
						System.out.println("________________________________________________________________");
						
					}
				}
				
				System.out.println("Do You Want To Search More Contacts :(Y/N)");
				char ch = sc.next().charAt(0);
				
				if(ch=='n' || ch=='N')
					flag = false ;
				sc.nextLine();
				
			}
			
			break;

		}			
	}
}

