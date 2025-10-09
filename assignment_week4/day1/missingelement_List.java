package assignment_week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class missingelement_List {

	public static void main(String[] args) {
		// Finding the missing element in the list
		int[] array= {1,2,6,3,4,10};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++)
		{
			list.add(array[i]);
		}
	
		Collections.sort(list);
		int count=list.get(0); 
		for(int j=0;j<list.size()-1;j++)
		{
			
			int cur=list.get(j);
		
			int curp=list.get(j+1);
			
			int d=curp-cur;
			
			
			if(curp-cur>1)
			{
			for(int s=cur+1;s<curp;s++)
			{
				System.out.println("The missing elements are: "+s);
			}
			}
			}
		}



}
