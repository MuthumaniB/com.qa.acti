package com.acti.testcase;

//Ctrl+Shift+O - To delete unwanted import
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest{
	
	@Test(enabled = true)
	public void testLoginPageTitle()
	{
		
		String expected = "actiTIME - Login";
		String actual = lp.getLoginPageTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(enabled = true)
	public void testActiImgDisplayed()
	{
		boolean flag = lp.verifyActiimg();
		Assert.assertTrue(flag);
		
	}
	
	@Test(enabled = true)
	public void testForgotPasswordLink()
	{
		
		boolean flag = lp.verifyForgotPasswordLink();
		Assert.assertTrue(flag);
		
	}
	
	@Test(enabled = true)
	public void tetsLoginFunction()
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
			
	}
	
	@Test(enabled = true)
	public void testLoginInvalidCredentials() throws InterruptedException
	{
	
		lp.enterPassword("admin");
		lp.clickLoginButton();
		Thread.sleep(3000);
		String errmsg = lp.getErrmsgText();
		System.out.println(errmsg);
		Assert.assertTrue(errmsg.contains("Username or Password is invalid"));
		
	}

}
