package testcase;

import org.testng.annotations.Test;

import base.base;
import pages.page1;

public class TC001_createlead extends base {

	@Test(dataProvider="fetchdata")
	public void createlead(String username,String password,String company,String first,String last)
	{
		page1 p=new page1();
		p.enterusername(username)
		.enterpassword(password)
		.submitbutton()
		.click_on_crmsfa()
		.createlead()
		.createleadbutton()
		.entercompany(company)
		.enterfirst(first)
		.enterlast(last);
	}
}
