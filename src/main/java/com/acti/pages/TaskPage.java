package com.acti.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
import com.acti.utils.Helper;
/*
 * Name : TaskPage
 * Description : Manages the locators and methods of Task page 
 * Developed By :Mani
 * Reviewed By : Santhosh
 * Date Reviewed : 04-27-2023
 */


public class TaskPage extends DriverScript
	{
	    // **************************************** Page Locators **************************************//
	    
	        @FindBy(xpath = "//div[text()='Add New']") WebElement addNewButton;
	        @FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement newCustomerOption;
	        @FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement customerNameTb;
	        @FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement customerDescriptionTArea;
	        @FindBy(xpath = "//div[contains(text(),'Create Customer')]") WebElement createCustomerButton;
	        @FindBy(xpath = "//span[@class='innerHtml']") WebElement successMsg;
	        @FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]") WebElement textboxStartTyping;
	        @FindBy(xpath = "//div[@class='filteredContainer'] //div[@class='title']") WebElement searchedCustomer;
	        @FindBy(xpath = "//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement buttonEdit;
	        @FindBy(xpath = "//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']") WebElement buttonAction;
	        @FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']") WebElement buttonDelete;
	                
	        @FindBy(xpath = "//div[@class='content_customerPanel']//div[@class='buttonIcon']") WebElement buttonDeletePermanently;
	      
	      
	        	        	     
	        // **************************************** Page Initialization *******************************//
	       
	        public TaskPage() {
	            PageFactory.initElements(driver, this);
	            
	        }

	        // **************************************** Page Methods **************************************//
	       
	        public void clickAddnewButton()
	        {
	            addNewButton.click();
	        }
	       
	        public void newCustomerOption()
	        {
	            newCustomerOption.click();
	        }
	       
	        public void enterCustomerName(String customername)
	        {
	            customerNameTb.sendKeys(customername);
	        }
	       
	        public void enterCustomerDescription(String customerDescription)
	        {
	            customerDescriptionTArea.sendKeys(customerDescription);
	        }
	       
	        public void clickCreateCustomer()
	        {
	            createCustomerButton.click();
	        }
	       
	        public String getSuccessMsg()
	        {
	            return successMsg.getText();
	        }
	       
	        public void searchCreatedCustomer(String customername)
	        {
	            textboxStartTyping.sendKeys(customername);
	          }
	        
	        public void clickSearchedCustomer()
	        {
	            searchedCustomer.click();
	        }
	       
	        public void clickAction()
	        {
	            buttonAction.click();
	            Helper.sleep();
	        }
	        public void clickEditButton()
	        {
	            buttonEdit.click();
	            Helper.sleep();
	        }
	       
	        public void clickDelete()
	        {
	            buttonDelete.click();
	           	Helper.sleep();
	          	                         
	        }
	        	       
	        public void clickDeletePermanently()
	         {
	        	      
	        	JavascriptExecutor je = (JavascriptExecutor) driver;	
	        	WebElement element = driver.findElement(By.xpath("//div[@class='content_customerPanel']//div[@class='buttonIcon']"));
	 	        je.executeScript("arguments[0].scrollIntoView(true);",element);
	 	        element.click();
		        Helper.sleep(); 
		          
	         }
                

			
		}



	
	       


	
