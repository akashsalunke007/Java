package collections;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {


		LinkedList<Integer> rollno = new LinkedList<>();
		
		rollno.add(3);
		rollno.add(5);
		rollno.add(8);
		rollno.add(9);
		rollno.add(10);
		
		rollno.addFirst(8765);
		
		rollno.addLast(8675);
		
		//rollno.remove(2);
		
		System.out.println(rollno.contains(11));
		
		
		
		int t = rollno.get(1) + rollno.get(2);
		System.out.println(t+"   \n\n");
		
		
		
		
		
		
		System.out.println(rollno.indexOf(10)+"   \n\n\n");
		
		for (int i = 0;i<rollno.size(); i++) {
			
			System.out.println(rollno.get(i));
			
		}

	}

}
