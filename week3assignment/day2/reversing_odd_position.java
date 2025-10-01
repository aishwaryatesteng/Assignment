package week3assignment.day2;

public class reversing_odd_position {

	public static void main(String[] args) {
	String text="I am a software tester";
	String[] test=text.split(" ");
	String final_text="";
	for(int i=0;i<test.length;i++)
	{
		if(i%2!=0)
		{
			String word=test[i];
			String rev="";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			final_text=final_text+rev+" ";
		}
		else
		{
			final_text=final_text+test[i]+" ";
		}
	}
	System.out.println(final_text);
	}
	}