package week3assignment.day2;

public class LoginTestData extends TestData{
   public void enterUsername()
   {
	   System.out.println("Enter the username");
   }
   public void enterPassword()
   {
	   System.out.println("Enter the password");
   }
	public static void main(String[] args) {

     LoginTestData l=new LoginTestData();
     l.enterPassword();
     l.enterUsername();
     l.navigateToHomePage();
	}

}
