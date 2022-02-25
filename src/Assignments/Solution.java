package Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Moisturizer> mz = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			int mId = sc.nextInt();
			sc.nextLine();
			String mName = sc.nextLine();
			int pr = sc.nextInt();
			String bName = sc.next();
			mz.add(new Moisturizer(mId, mName, pr, bName));
		}
		
		String brand = sc.nextLine();
 		
		
		if (getHighestPriceMoisturizerByBrandName(mz, brand)!=null) {
			Moisturizer obj = getHighestPriceMoisturizerByBrandName(mz, brand);
			System.out.println(obj.getMoisturizerId());
			System.out.println(obj.getMoisturizerName());
			System.out.println(obj.getPrice());
			System.out.println(obj.getBrandName());
		}
		else {
			System.out.println("no Such moisturizer found");
		}

	}

	public static Moisturizer getHighestPriceMoisturizerByBrandName(ArrayList<Moisturizer> list, String brand) {
		Collections.sort((List) list);
		Collections.reverse(list);
		
		for(int i = 0; i < 2; i++) {
			if (brand.equalsIgnoreCase(list.get(i).getBrandName())) {
				return list.get(i);
			}

		}

		return null;

	}

	public static Moisturizer getSecondHighestPriceMoisturizer(ArrayList<Moisturizer> list, String brand) {
		return null;
	}

}
