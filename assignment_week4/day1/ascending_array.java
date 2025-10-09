package assignment_week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ascending_array {

	public static void main(String[] args) {
		String[] string_array={"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list=new ArrayList<String>();
		for(int i=0;i<string_array.length;i++)
		{
			list.add(string_array[i]);
		}
		Collections.sort(list);
		for(int j=list.size()-1;j>=0;j--)
		{
			System.out.print(list.get(j)+" ");
		}


	}

}
