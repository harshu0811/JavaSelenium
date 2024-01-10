package HandlingWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCampco {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///E:/Java_Selenium/Resources/MultipleWindow.html");
			driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
			Thread.sleep(2000);
			Set<String> allWindowIds = driver.getWindowHandles();
			for(String windowId : allWindowIds) {
				driver.switchTo().window(windowId);
				if(driver.getTitle().contains( "Campco"))
					driver.close();
			}

	}
}
