package assignment_week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class second_Largest {

	public static void main(String[] args) {
		int[] a={3, 2, 11, 4, 6, 7};
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			list1.add(a[i]);
		}
		Collections.sort(list1);
		System.out.println("The second largest element in the list is: "+list1.get(1));
		

	}

}
