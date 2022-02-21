package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		
		name.add("Akash");
		name.add("Rutika");
		name.add("Ajay");
		name.add("Sameeksha");
		name.add("Raghav");
		
		
		
		
		Scanner sc = new Scanner(System.in);
			
		
		
		name.add(2,"123456678");
		
		//name.clear();

		name.remove(2);
			
		for (int i=0 ;i<name.size();i++) {   //Size() gets size of ArrayList
			
			System.out.print(name.get(i) +"  ");     //get() shows elements in arraylist
			
			
		}
		
		System.out.println("\n"+name.contains("Sameeksha"));
		
		System.out.println(name.indexOf("Akash"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
