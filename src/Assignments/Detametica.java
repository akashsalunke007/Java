package Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class Detametica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int A[] = new int[N];
		
		for (int i = 0; i < A.length; i++) {
			A[i]=sc.nextInt();
		}
		
		System.out.println(lastNumberLeft(N, A));

	}
	
	
	public static int lastNumberLeft(int N,int A[]) {
		
		Arrays.sort(A);	
		
		int result = A[N/2];
		
		return result;
	}

}
