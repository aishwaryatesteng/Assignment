package assignment_week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list_Intersection {

	public static void main(String[] args) {
		int[] a= {3, 2, 11, 4, 6, 7};
		int[] b= {1, 2, 8, 4, 9, 7};
		List<int[]> list1=Arrays.asList(a);
		List<int[]> list2=Arrays.asList(b);
		
		for(int A:a)
		{
			for(int B:b)
			if(A==B)
			{
				System.out.println("The duplicate values are:"+A);
			}
		}
		

	}

}
