package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {
	public WebDriver driver;

	public YourCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


   @FindBy(xpath="//*[@id=\"item_4_img_link\"]/img")
   WebElement SauceLabsBackpack;

   @FindBy(xpath="//*[@id=\"inventory_item_container\"]/div/div/div/button")
   WebElement AddToCart;
   
   @FindBy(xpath="//*[@id=\"inventory_item_container\"]/div/button")
   WebElement Back;
   
   
   @FindBy(xpath="//*[@id=\"item_0_img_link\"]/img")
   WebElement SauceLabsBikeLight ;
   
  
   @FindBy(xpath="//*[@id=\"item_5_img_link\"]/img")
   WebElement SauceLabsFleeceJacket ;
   
   @FindBy(xpath="//*[@id=\"item_3_img_link\"]/img")
   WebElement TestallTheThingsTShirtRed ;
   


   public void verifyProductPage() throws InterruptedException {
	   SauceLabsBackpack.click();
	   Thread.sleep(4000);
	   AddToCart.click();
	   Back.click();
	   SauceLabsBikeLight.click();
	   Thread.sleep(4000);
	   AddToCart.click();
	   Back.click();
	   SauceLabsFleeceJacket.click();
	   Thread.sleep(4000);
	   AddToCart.click();
	   Back.click();
	   TestallTheThingsTShirtRed.click();
	   Thread.sleep(4000);
	   AddToCart.click();
	   Back.click();
	   
	   
}
}