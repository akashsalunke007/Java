package Assignments;

public class Toggle {
	public static void main(String[] args) {
		
		
		System.out.println(toggleString("abcd"));
		
	}
	
	static String toggleString(String str)
	{
		String result = "" ;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>=65 && str.charAt(i)<=90) 
			{
				char c = str.charAt(i);
				c += 32 ;
				result = result + c ;
			}
			else if (str.charAt(i)>=97 && str.charAt(i)<=122) 
			{
				char c = str.charAt(i);
				c -= 32 ;
				result = result + c ;
			}
		}
		return result;
	}
  
}
