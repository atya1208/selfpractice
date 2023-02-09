package Self_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dr=new EdgeDriver();
		dr.get("https://flippa.com/");
		dr.manage().window().maximize();
		//implicit wait command 
 		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		
 		//explicit wait command
 		
		WebElement blog = dr.findElement(By.xpath("//div[@class='hero-scrollable-text__container']/div[1]/span/a[text()='Blogs']"));

 		WebDriverWait wait=new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='hero-scrollable-text__container']/div[1]/span/a[text()='Blogs']")));

 		
 		String ec =blog.getText();
 		System.out.println(ec);
 		dr.quit();
 		
 		
 		
 		
 		
 		

	}

}
