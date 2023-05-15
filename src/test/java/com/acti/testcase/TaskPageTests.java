package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TaskPageTests  extends BaseTest{
	@Test(priority = 1,enabled=true)
	public void testCreateCustomer()
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		String actual = ep.getuserLoggedin();
        Assert.assertTrue(actual.contains("John"));
        ep.clickTaskMenu();
        tp.clickAddnewButton();
        tp.newCustomerOption();
        tp.enterCustomerName("TestCustomer");
        tp.enterCustomerDescription("I am Dummy customer created bu Automation");
        tp.clickCreateCustomer();
        String msg = tp.getSuccessMsg();
        System.out.println(msg);
        Assert.assertTrue(msg.contains("has been created"));
        ep.ClickLogout();
             
	}
	
	@Test(priority = 2, enabled=true)
	public void testDeleteCustomer()
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		String actual = ep.getuserLoggedin();
        Assert.assertTrue(actual.contains("John"));
        ep.clickTaskMenu();
        tp.searchCreatedCustomer("TestCustomer");
        tp.clickSearchedCustomer();
        tp.clickEditButton();
        tp.clickAction();
        tp.clickDelete();        
        tp.clickDeletePermanently();
        String msg = tp.getSuccessMsg();
        System.out.println(msg);
        Assert.assertTrue(msg.contains("has been deleted"));
        ep.ClickLogout();
		
	}
	
	
	

}





