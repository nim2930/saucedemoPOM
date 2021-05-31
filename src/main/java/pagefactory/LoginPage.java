package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Random;

import com.aventstack.extentreports.ExtentTest;

public class LoginPage {
	public WebDriver driver;
    public ExtentTest xTest;
    
	public LoginPage(WebDriver driver, ExtentTest xTest) {
		this.driver=driver;
		this.xTest=xTest;
		PageFactory.initElements(driver, this);
	}


   @FindBy(xpath="//*[@id=\"user-name\"]")
   WebElement UserName;

   @FindBy(xpath="//*[@id=\"password\"]")
   WebElement Password;
   @FindBy(xpath="//*[@id=\"login-button\"]")
   WebElement LoginButton ;


public void verifyLoginpage() {
	UserName.sendKeys( "standard_user");
	Password.sendKeys("secret_sauce");
	LoginButton.click();
	xTest.pass("Products page opened successfully");
}
}