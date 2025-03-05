package com.crm.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Organization
{
	public Organization(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement Plus_org;

	@FindBy(xpath="//input[@name='accountname']")
	private WebElement account_name;

	@FindBy(xpath= "//input[@title='Save [Alt+S]']")
	private WebElement save;
	
	@FindBy(xpath= "//span[@class='dvHeaderText']")
	private WebElement header;

	@FindBy(xpath="//select[@name='industry']")
	private WebElement  industry;


	public void Plus_org()
	{
		Plus_org.click();
	}

	public void account_name(String data)
	{
		account_name.sendKeys(data);
	}


	public void save()
	{
		save.click();
	}

	public WebElement header()
	{
		return header;
	}
	
	public void idustry() 
	{
		ChromeDriver driver = new ChromeDriver();
		WebElement small = driver.findElement(By.name("industry"));
		small.click();
		Select sel = new Select(small);
		sel.selectByValue("Banking");
	
	}
}
