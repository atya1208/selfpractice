package Self_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_practice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver dr=new EdgeDriver();
	dr.get("https://www.istockphoto.com/photos/world-flags");
	dr.manage().window().maximize();
	
	Actions act =new Actions(dr);
	WebElement video=dr.findElement(By.xpath("//ul[@class='SubNav-module__container___BbYpX']/li[1]"));
	WebElement photo=dr.findElement(By.xpath("//ul[@class='SubNav-module__container___BbYpX']/li[2]"));
	WebElement illustations=dr.findElement(By.xpath("//ul[@class='SubNav-module__container___BbYpX']/li[3]"));
	
	//mouse hover action (act.movetoelement(target).build().perform()
	act.moveToElement(video).build().perform();
	Thread.sleep(5000);
	act.moveToElement(photo).build().perform();
	Thread.sleep(5000);
	act.moveToElement(illustations).build().perform();
	Thread.sleep(5000);
	dr.close();

	}

}
