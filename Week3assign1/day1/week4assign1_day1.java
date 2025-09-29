package Week3assign1.day1;

import java.util.Arrays;

public class week4assign1_day1 {
    //printing the missing values of array
	public static void main(String[] args) {
     int[] array= {4,3,1,9,6};
     Arrays.sort(array);
     int n=array[0],d;
     for(int i=0;i<array.length;i++)
     {
    	 if(array[i]!=n)
    	 {  
    		 d=array[i]-n;
    		 for(int j=0;j<d;n++, j++)
    		 {
    			 System.out.println("The missing values are: "+n);
    		 }
    	 }
    	 n++;
     }
}
}
