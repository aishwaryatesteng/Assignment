package Week.Day1;

import java.util.Scanner;

public class palindrome_day2assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n,rem,rev=0;
       System.out.println("Enter the number: ");
       n=s.nextInt();
       int input=n;
       for(int i=0;n>0;i++)
       {
    	   rem=n%10;
    	   n=n/10;
    	   rev=rev*10+rem;
       }
       System.out.println(rev);
       if(input==rev)
       {
    	   System.out.println("Palindrome");
       }
       else
       {
    	   System.out.println("Not a Palindrome");
       }
	}

}
