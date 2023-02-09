package Self_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class wait_command {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dr=new EdgeDriver();
		dr.get("https://www.jiomart.com/");
		dr.manage().window().maximize();
 		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		
 		WebElement sam=dr.findElement(By.xpath("//*[@alt='home_mpc_SamsungA14']"));
 		Actions act =new Actions(dr);
 		act.moveToElement(sam).click().build().perform();
 		dr.getTitle();
 		System.out.println(sam);
 		
		

	}

}
