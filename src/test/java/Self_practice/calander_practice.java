package Self_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class calander_practice {

		public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			WebDriver dr=new EdgeDriver();
			dr.get("https://www.redbus.in/");
			dr.manage().window().maximize();
			//implicit wait command 
	 		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		dr.findElement(By.id("onward_cal")).click();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> calender=dr.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println(calender.size());
		
		for(int i=0;i<calender.size();i++) {
			String date=calender.get(i).getText();
			System.out.println(date);
			if(date.equalsIgnoreCase("20")) {
				calender.get(i).click();
				System.out.println("selected Date:"+date);
				break;
			}
				}
			dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			dr.quit();
		
		
		

	}

}
