package Self_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class scrollmethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//only applicable for select tag
		WebElement mo =driver.findElement(By.id("month"));
		Select obj = new Select(mo);
		//obj.selectByIndex(11);
		//obj.selectByValue("7");
		List<WebElement>lst=obj.getOptions();
		System.out.println(lst);
		String expValue= "Mar";
		for(int i=0;i<lst.size();i++)
		{
			String actValue=lst.get(i).getText();
			System.out.println(actValue);
			if(actValue.equals(expValue))
			{
				obj.selectByIndex(i);
				break;
			}
			
		}
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
