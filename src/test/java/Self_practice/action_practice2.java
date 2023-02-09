package Self_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_practice2 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			WebDriver dr=new EdgeDriver();
			dr.get("https://twitter.com/i/flow/signup");
			dr.manage().window().maximize();
	 		Thread.sleep(3000);
	 		
	 		//click and passing text through send keys using action interface
			Actions act =new Actions(dr);
			WebElement create =dr.findElement(By.xpath("//div[@style='color: rgb(255, 255, 255);']"));
			act.moveToElement(create).click().build().perform();
			
			WebElement name =dr.findElement(By.xpath("//input[@name='name']"));
			WebElement phone =dr.findElement(By.xpath("//input[@name='phone_number']"));
			act.click(name).sendKeys("atyanand@gmail.com").build().perform();
			Thread.sleep(5000);
			act.click(phone).sendKeys("7903315754").build().perform();
			Thread.sleep(5000);
			
			//copy and paste command using action interface
			act.keyDown(name,Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).build().perform();
			Thread.sleep(5000);
			act.keyDown(name,Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
			Thread.sleep(5000);
			act.keyDown(phone,Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).build().perform();
			Thread.sleep(5000);
			dr.close();
			
			
	}

}
