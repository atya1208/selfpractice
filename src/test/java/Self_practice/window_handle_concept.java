package Self_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class window_handle_concept {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	System.out.println(driver.getTitle());
	
	Set<String> s=driver.getWindowHandles();
	for(String i:s)
	{
		String t=driver.switchTo().window(i).getTitle();
		System.out.println(t);

	}
		
		
		
		
		

	}

}
