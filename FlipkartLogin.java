package handsOnPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']")).click();
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("7708534511");
		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
		Thread.sleep(1200);
	}

}
