package com.crm.BaseClassVT;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.pom.*;

import FileUtilityVT.ReadFromProperties;

public class VTBaseClass
{
public static WebDriver driver = null;
@BeforeClass
public void preCondition() throws IOException
{
String browser = ReadFromProperties.propertyData("browser");
String url = ReadFromProperties.propertyData("url");
if (browser.equalsIgnoreCase("chrome")) {
driver = new ChromeDriver();
}
else if (browser.equalsIgnoreCase("edge")) {
driver = new EdgeDriver();
}
else if (browser.equalsIgnoreCase("firefox")) {
driver = new FirefoxDriver();
}
else {
driver = new ChromeDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get(url);
}

@BeforeMethod
public void login() throws IOException{
String username = ReadFromProperties.propertyData("username");
String password = ReadFromProperties.propertyData("password");
Login log = new Login(driver);
log.userName(username);
log.passward(password);
log.LoginButton();
}
@AfterMethod
public void logOut()
{
Home hp = new Home(driver);
hp.profile();
hp.signOut();

}
@AfterClass
public void postCopndition()
{
driver.quit();
}
}
