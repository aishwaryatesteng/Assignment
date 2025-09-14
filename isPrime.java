package Week.Day1;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the input: ");
     int count=0;
     int n=s.nextInt();
     for(int i=1;i<=n/2;i++)
     {
    	 if(n%i==0)
    	 {
    		 count=count+1;
    	 }
     }
     if(count==1)
     {
    	 System.out.println("Prime");
     }
     else
     {
    	 System.out.println("Not a Prime");
     }
	}

}
