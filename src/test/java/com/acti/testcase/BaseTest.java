package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.LoginPage;

public class BaseTest extends DriverScript {
	LoginPage lp;
	@BeforeMethod
	public void pretest()
	{
		initApplication();
		 lp = new LoginPage();
	}
	@AfterMethod
	public void teardown()
	{
		quitDriver();
		
	}

}
