package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(name="user_name")
	private WebElement email;

	@FindBy(name = "user_password")
	private WebElement pwd;

	@FindBy(id= "submitButton")
	private WebElement submit_button;



	public void userName(String data)
	{
		email.sendKeys(data);
	}

	public void passward(String pass)
	{
		pwd.sendKeys(pass);
	}


	public void LoginButton()
	{
		submit_button.click();
	}

	}

