package TestCaseVT;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClassVT.VTBaseClass;
import com.crm.JavaUtility.GenerateRandomNumberVT;
import com.crm.pom.Home;
import com.crm.pom.Organization;


public class OrganizationTask7 extends VTBaseClass
{
	@Test
public void testCase1() throws EncryptedDocumentException,IOException,InterruptedException
{
	Home home= new Home(driver);
	assertTrue(home.home().isDisplayed(),"Not In Vtiger home page");
	Reporter.log("In the Vtiger Home PAage");
	home.organization();
	Organization org= new Organization(driver);
	org.Plus_org();
	String org_Name = FileUtilityVT.ReadFromExel.propertyData("Organization", 0, 0);
	int dynamic=GenerateRandomNumberVT.random();
	String expected_Org = org_Name+dynamic;
	org.account_name(org_Name+dynamic);
	ChromeDriver driver = new ChromeDriver();
	WebElement small = driver.findElement(By.name("industry"));
	small.click();
	Select sel = new Select(small);
	sel.selectByValue("Banking");
	org.save();
	

	String actual_Org=org.header().getText();
	assertTrue(actual_Org.contains(expected_Org));
	Thread.sleep(4000);
}
}

