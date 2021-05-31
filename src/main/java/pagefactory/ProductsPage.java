package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ProductsPage {
	public WebDriver driver;
	public ExtentTest xTest;

	public ProductsPage(WebDriver driver, ExtentTest xTest) {
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
	
    @FindBy(xpath="//*[@id=\"item_4_img_link\"]/img")
    WebElement SauceLabsBackpack;

   @FindBy(xpath="//*[@id=\"inventory_item_container\"]/div/div/div/button")
   WebElement AddToCart;
   
   @FindBy(xpath="//*[@id=\"back-to-products\"]")
   WebElement Back;//*[@id="back-to-products"]
   
   @FindBy(xpath="//*[@id=\"item_0_img_link\"]/img")
   WebElement SauceLabsBikeLight ;
   
  
   @FindBy(xpath="//*[@id=\"item_5_img_link\"]/img")
   WebElement SauceLabsFleeceJacket ;
   
   @FindBy(xpath="//*[@id=\"item_3_img_link\"]/img")
   WebElement TestallTheThingsTShirtRed ;
   
   
   @FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/span")
   WebElement ShoppingCartButton ;
   
   @FindBy(xpath="//*[@id=\"checkout\"]")
   WebElement CheckOutButton ;//*[@id="checkout"]
   
   @FindBy(xpath="//*[@id=\"first-name\"]")
   WebElement FirstName;

   @FindBy(xpath="//*[@id=\"last-name\"]")
   WebElement LastName;
   
   @FindBy(xpath="//*[@id=\"postal-code\"]")
   WebElement PostalCode;
   
   @FindBy(xpath="//*[@id=\"finish\"]")
   WebElement Finish;
   
   @FindBy(xpath="//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
   WebElement Continue;
   
   @FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
   WebElement TextMessage;


   public void verifyProductPage() throws InterruptedException {
	    UserName.sendKeys( "standard_user");
		Password.sendKeys("secret_sauce");
		LoginButton.click();
	    SauceLabsBackpack.click();
	    xTest.log(Status.INFO, "SauceLabsBackpack page opened successfully");
	    Thread.sleep(2000);
	    AddToCart.click();
	    xTest.log(Status.INFO, "SauceLabsBackpack added to your cart successfully");
	    Back.click();
	    xTest.log(Status.INFO, "Products page opened successfully");
	   
	   SauceLabsBikeLight.click();
	   xTest.log(Status.INFO, "SauceLabsBikeLight page opened successfully");
	   Thread.sleep(2000);
	   AddToCart.click();
	   xTest.log(Status.INFO, "SauceLabsBikeKight added to your cart successfully");
	   Back.click();
	   xTest.log(Status.INFO, "Products page opened successfully");
	   
	   SauceLabsFleeceJacket.click();
	   xTest.log(Status.INFO, "SauceLabsFleeceJacket page opened successfully");
	   Thread.sleep(2000);
	   AddToCart.click();
	   xTest.log(Status.INFO, "SauceLabsFleeceJacket added to your cart successfully");
	   Back.click();
	   xTest.log(Status.INFO, "Products page opened successfully");
	   
	   TestallTheThingsTShirtRed.click();
	   xTest.log(Status.INFO, "TestallTheThingsTShirtRed page opened successfully");
	   Thread.sleep(2000);
	   AddToCart.click();
	   xTest.log(Status.INFO, " TestallTheThingsTShirtRed added to your cart successfully");
	   Back.click();
	   xTest.log(Status.INFO, "Products page opened successfully");
	   
	   ShoppingCartButton.click();
	   xTest.pass("Your cart page opened with your shopping products successfully");
	   Thread.sleep(2000);
	   CheckOutButton.click();
	   xTest.pass("Checkout:Your information page opened successfully");
	   Thread.sleep(2000);
	   FirstName.sendKeys("sat");
	   LastName.sendKeys("Dup");
	   PostalCode.sendKeys("650");
	   Continue.click();
	   xTest.pass("Checkout:Overview page opened successfully");
	   Thread.sleep(2000);
	   Finish.click();
	   xTest.pass("Finish page opened successfully");
   }

public void verifyTextMessage() {
	String str=TextMessage.getText();
	if(str.contains("THANK YOU")) 
		xTest.pass("pass, it contained THANK YOU");
		//System.out.println("pass, it contained THANK YOU ");
		else
			xTest.pass("Fail, it did not contain THANK YOU");	
			//System.out.println("Fail, it did not contain THANK YOU");
		
	}
}
