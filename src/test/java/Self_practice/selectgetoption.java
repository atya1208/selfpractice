package Self_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectgetoption {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		FirefoxDriver dr =new FirefoxDriver();
		dr.get("https://www.facebook.com/signup");
		
		WebElement mo=dr.findElement(By.id("month"));

		Select sl = new Select(mo);
		
		//sl.selectByIndex(7);
		//Thread.sleep(5000);
		
		List <WebElement> li=sl.getOptions();
		System.out.println(li);
		String expval="Mar";
		for(int i=0;i<li.size();i++)
		{
			String actval=li.get(i).getText();
			System.out.println(actval);
			if(actval.equals(expval)) ;
			{
				sl.selectByIndex(i);
				break;
				
			}

		}
		
		
	}
}

	


