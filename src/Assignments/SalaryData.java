package Assignments;

public class SalaryData {
	String name;
	int daysInMonth ;
	double salary;
	
	public SalaryData(String name, int daysInMonth, double salary) {
		super();
		this.name = name;
		this.daysInMonth = daysInMonth;
		this.salary = salary ;
	}
}


class Validator{

	public static String validateSalaryData(SalaryData s) throws Exception{
		
		if (s.daysInMonth == 28 || s.daysInMonth == 30 || s.daysInMonth == 31) {
			
			if (s.salary>0 && s.salary<1000000) {
				return "Valid Data" ;
			}
			else {
				return "Invalid Salary" ;
			}
		}
		else 
		{
			return "Invalid Day" ;
		}
	}

	
	public static double getTotalSalary(SalaryData s) {
;		
		try {
			validateSalaryData(s);
		} catch (Exception e) {
			
		}	
		
		return s.daysInMonth*s.salary ;
	}

}







class InvalidDayE extends Exception{
	
	public InvalidDayE() {}
	
	InvalidDayE(String m)
	{
		super(m);
	}
	
	
}
