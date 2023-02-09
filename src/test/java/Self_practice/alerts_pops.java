package Self_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts_pops {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//alert box with ok pop up
		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.close();
		
		
		

	}

}
