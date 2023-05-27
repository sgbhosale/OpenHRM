package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_Page {

	
	public WebDriver driver;
	
	public PIM_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="input#firstName")
	WebElement firstName;
	
	@FindBy(css="input#middleName")
	WebElement middleName;
	
	@FindBy(css="input#lastName")
	WebElement lastName;
	
	@FindBy(css="input#employeeId")
	WebElement employeeId;
	
	@FindBy(css="input#photofile")
	WebElement filephoto;
	
	@FindBy(css="input#btnSave")
	WebElement saveRecord;
	
	public void enterFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void enterMiddleName(String fname)
	{
		middleName.sendKeys(fname);
	}
	
	public void enterLastName(String fname)
	{
		lastName.sendKeys(fname);
	}
	
	public void enterEmpId(String fname)
	{
		employeeId.sendKeys(fname);
	}
	
	public void clickToUpload()
	{
		filephoto.click();
	}
	public void clickToSave()
	{
		saveRecord.click();
	}
	
	
	
}
