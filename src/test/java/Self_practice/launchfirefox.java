package Self_practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfirefox {

	public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
    FirefoxDriver driver =new FirefoxDriver();
    driver.get("https://www.cricbuzz.com/");

	}

}
