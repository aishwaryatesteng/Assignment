package Week.Day1;

import java.util.Scanner;

public class fibseries_day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,third,input_range;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input range: ");
		input_range=s.nextInt();
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(int i=2;i<input_range;i++)
		{
			third=first+second;
			first=second;
			second=third;
			System.out.print(third+" ");
		}
	}

}
