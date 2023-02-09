package Self_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_practice3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dr=new EdgeDriver();
		dr.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		dr.manage().window().maximize();
 		Thread.sleep(3000);
 		
 		//right click using action interfaces
		Actions rt =new Actions(dr);
		WebElement seoul =dr.findElement(By.xpath("//div[@id='box5']"));
		rt.contextClick(seoul).build().perform();
		Thread.sleep(3000);
		
		//drag and drop using action interfaces
		WebElement washington =dr.findElement(By.xpath("//div[@id='box3']"));
		WebElement usa =dr.findElement(By.xpath("//div[@id='box103']"));
		rt.dragAndDrop(washington, usa).build().perform();
		Thread.sleep(3000);
		

	}

}
