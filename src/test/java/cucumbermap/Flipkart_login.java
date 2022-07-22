package cucumbermap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_login {

	public static void main(String[] args)
	{
		//BrowserLaunch
	    System.setProperty("webdriver.chrome.driver", "D:\\Automation support\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
				//openBrowser	
				driver.get("https://www.flipkart.com/");
		//click on login button
				//driver.findElementByLinkText("Login").click();
				//cancel login
				driver.findElementByXPath("//button[@class='_2KpZ6l _2doB4z']").click();
				//click on my profile 
				Actions act=new Actions(driver);
				WebElement abc= driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
				act.moveToElement(abc).build().perform();
				//enter username
				driver.findElementByXPath("//input[@class='_2IX_2- VJZDxU']").sendKeys("7350687555");
				//enter password
				driver.findElementByXPath("//input[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("7350687555");
				//click on login button
				driver.findElementByXPath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
				System.out.println("log in successfully");
				

	}

}
