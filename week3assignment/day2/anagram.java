package week3assignment.day2;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// Checking if two strings are anagram
		String text1="stops",text2="potss";
		int length1=text1.length(),length2=text2.length();
		char[] text11=text1.toCharArray();
		char[] text22=text1.toCharArray();
		
		if(length1==length2)
		{
			Arrays.sort(text11);
			Arrays.sort(text22);
			int  count=0;
			for(int i=0;i<text11.length;i++)
			{
				if(text11[i]==text22[i])
				{
					count=count+1;
				}
			}
			if(count==length1)
			{
				System.out.println("The given string is an anagram");
			}
			
			else
			{
				System.out.println("The string is not an anagram!");
			}
		}
		else
		{
			System.out.println("The string is not an anagram!");
		}
	}

}
