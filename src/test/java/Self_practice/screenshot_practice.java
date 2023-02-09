package Self_practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshot_practice {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver dr=new EdgeDriver();
		dr.get("https://en.wikipedia.org/wiki/Krishna#:~:text=Krishna%20(%2F%CB%88kr%C9%AA,widely%20revered%20among%20Indian%20divinities.");
		dr.manage().window().maximize();
		//implicit wait command 
 		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	dr.findElement(By.xpath("//a[@class=\"image\"]/img")).click();
	dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//screenshot and saving the file at different location
	File srcFile=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	Files.copy(srcFile,new File("C:\\Users\\HP\\eclipse-workspace\\myproject\\pic.jpg"));
	System.out.println("screenshot captured");

	}

}
