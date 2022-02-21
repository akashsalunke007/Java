package collections;



public class Student {
    
 private String name;
   private int roll;
   private int marks;
   
   public Student() {
    
   }
    
   public Student(String name,int roll,int marks)
   {
    this.name=name;
    this.marks=marks;
    this.roll=roll;
   }
   
   public int getRoll()
   {
    return  roll;
   }
   
   public void setroll(int roll)
   {
    
    this.roll=roll;
   }
  
   public int getmarks()
   {
    return  marks;
   }
   public void setmarks(int marks)
   {
    
    this.marks=marks;
   }
  public String getname()
   {
    return  name;
   }
  
  public void setname(String name)
  {
    
    this.name=name;
  }
 
   
}