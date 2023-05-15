package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.EnterPage;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskPage;

public class BaseTest extends DriverScript {
	LoginPage lp;
	EnterPage ep;
	TaskPage tp;
	
	@BeforeMethod
	public void pretest()
	{
		initApplication();
		 lp = new LoginPage();
		 ep=new EnterPage();
		 tp=new TaskPage();
	}
	@AfterMethod
	public void teardown()
	{
		quitDriver();
		
	}

}

