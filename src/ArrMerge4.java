import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.ArrayList;
import java.util.Scanner ;
class ArrMarge4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;

		//System.out.println("Enter Size Of Array 1 :");
		int s1 = sc.nextInt();
		char a[] = new char[s1] ;

		for (int i = 0 ; i<a.length ; i++ )
		{
			//System.out.println("Enter Element Of Array1 at Index "+i);
			a[i] = sc.next().charAt(i) ;

		}

		System.out.println("\n\nEnter Size Of Array 2 :");
		int s2 = sc.nextInt();
		int b[] = new int[s2] ;
		ArrayList a1 = new ArrayList<>();
		for (int i = 0 ; i<b.length ; i++ )
		{
			System.out.println("Enter Element Of Array2 at Index "+i);
			b[i] = sc.nextInt() ;

		}
		
		
		
		
		
		if (a.length ==  b.length )
		{			
			for (int i = 0 ; i < b.length ;i++ )
			{
				System.out.print(a[i]);
				System.out.print(b[i]);
				
			}
		}
		
		else if (a.length > b.length) {
			
			
			for (int i = 0; i < b.length; i++) {
				
				
				a1.add(a[i]);
				a1.add(b[i]);
				
				if(i>=b.length)
				{
					for (int j = b.length; j < a.length; j++) {
						a1.add(a[i]);
					}
				}
			}
		}
		
		
		
		else if (a.length < b.length) {
			
			
			for (int i = 0; i < a.length; i++) {
				
				
				a1.add(a[i]);
				a1.add(b[i]);
				
				if(i>=a.length)
				{
					for (int j = a.length; j < b.length; j++) {
						a1.add(b[i]);
					}
				}
			}
		}
		
		
		for(Object o : a1)
		{
			System.out.print(o);
		}
	}
}