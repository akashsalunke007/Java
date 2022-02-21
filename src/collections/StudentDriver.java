package collections;


import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDriver {

public static void main(String[]args)
{
 
    ArrayList<Student>Student =new ArrayList<>();
   
    Scanner sc = new Scanner(System.in);
    String choice = "";
 
    do {
    	
	   System.out.println("\nEnter Student1 name");
	   String name  = sc.nextLine();
       System.out.println("Enter  Roll no");
       int roll =sc.nextInt();
       System.out.println("Enter Marks");
       int marks =sc.nextInt();
    
       System.out.println("Student 1  is added");
       
       Student.add(new Student(name, roll, marks));
     
       System.out.println("Do you want to enter more student data");
       System.out.println("Enter YES OR NO");
       
       choice = sc.next();
       
       sc.nextLine();
        
 }while(choice.equalsIgnoreCase("YES"));
    
  
    
 for (int i = 0; i < Student.size(); i++) {
  Student student = Student.get(i);
  System.out.println("Name is : "+Student.get(i).getname()+" Roll No : "+Student.get(i).getRoll()+" Has Marks :"+Student.get(i).getmarks());
 
 }
}
}