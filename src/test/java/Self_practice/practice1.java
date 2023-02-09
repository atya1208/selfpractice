package Self_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ishaan = new ChromeDriver();
		ishaan.get("https://demo.guru99.com/test/newtours/");
		ishaan.manage().window().maximize();
		
		ishaan.findElement(By.xpath("//input[@name='userName']")).sendKeys("meenakshi");
		Thread.sleep(3000);
		ishaan.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		Thread.sleep(3000);
		ishaan.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
		String exp_result= "Welcome: Mercury Tours";
		String act_result=ishaan.getTitle();
		System.out.println(act_result);
		
		if(exp_result.equals(act_result)==true)
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		ishaan.close();
		
		
	}

}
