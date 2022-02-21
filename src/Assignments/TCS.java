package Assignments;

import java.util.Iterator;

public class TCS {

	public static int[] ArrayShift(int arr[]) {
		int temp = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;

		return arr;
	}

	public static void main(String[] args) {
		int a[] = { 4,5,1,2,3};
		boolean flag = false;

		for (int i = 0; i<a.length && !flag; i++) {
			int count = 0;
			int[] res;
			int res1[] = new int[a.length] ;
			
			
			if (i==0) {
				res = ArrayShift(a);
				res1 = res;
			}
			else
			{
				res = ArrayShift(res1);
			}
			
			
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					break;
				}
				
				count++;
			}

			if (count == a.length - 1) {
				flag = true;
			}
			
		}

		System.out.println(flag);

		
	}

}
