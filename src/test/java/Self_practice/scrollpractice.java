package Self_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class scrollpractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		JavascriptExecutor jsx =(JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy( 0, 800)");
		Thread.sleep(4000);
		jsx.executeScript("window.scrollBy( 0, -800)");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("refrigerator");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		WebElement page = driver.findElement(By.xpath("//div[@class='_2MImiq']"));
		if(page.isDisplayed())
		{
			jsx.executeScript("arguments[0].scrollIntoView();", page);
			System.out.println("scroll to page is secussfull");
			}
		else
		{
		System.out.println("unable to locate the webelement");	
		}
		Thread.sleep(4000);
		//jsx.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//Thread.sleep(4000);
		
		
		

}
}
