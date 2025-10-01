package week3assignment.day2;

public class oddIndextoUppercase {

	public static void main(String[] args) {
		//changing odd index to uppercase
		String text="changeme";
		String final_text="";
	   for(int i=0;i<text.length();i++)
		{
			if(i%2!=0)
			{
				char c=text.charAt(i);
				char upperCase = Character.toUpperCase(c);
				final_text=final_text+upperCase;
       }
			else
			{
				final_text=final_text+(text.charAt(i));
			}
		}
	   System.out.println(final_text);
		 

	}

}
