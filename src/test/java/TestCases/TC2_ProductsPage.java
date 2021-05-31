package TestCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.ProductsPage;



public class TC2_ProductsPage {
	@Test
	public void test() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nimisha\\eclipse-workspace\\saucedemoPOM\\BrowserDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		ExtentHtmlReporter htmlrep = new ExtentHtmlReporter("saucedemoNimisha.html");
		ExtentReports exTent = new ExtentReports();
		exTent.attachReporter(htmlrep);
		ExtentTest test1 = exTent.createTest("saucedemoTest", "testing of saucedemo app by Nimisha");
		
		
		driver.get("https://www.saucedemo.com/inventory.html");
		Thread.sleep(2000);
		test1.log(Status.INFO, "Opened the saucedemo site successfully ");
		test1.pass("Entered user name and password then clicked on login button, All the products opened successfully");
		ProductsPage pp=new ProductsPage(driver,test1);
		pp.verifyProductPage();
		pp.verifyTextMessage();
		driver.close();
		exTent.flush();
		
}
}