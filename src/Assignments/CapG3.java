package Assignments;

public class CapG3 {

	public static void main(String[] args) {
		
		String s = "DoSelect";
		
		String resuString = camelToSnake(s);
		System.out.println(resuString);

	}
	
	public static String camelToSnake(String str) {
		
		String res = "" ;
		for (int i = 0; i < str.length(); i++) {
			
		   if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				
				res = res + ' ' + str.charAt(i);
			}
		   else {
			   res = res + str.charAt(i);
		}
		}
		
		String r1 = res.trim();
		
		String r2 = r1.replace(' ', '_');
		
		
		return r2.toLowerCase() ;
	}

}
