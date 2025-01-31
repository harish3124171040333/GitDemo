import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text() = \"Nested Frames\"]")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name=\"frame-top\"]")));
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]")));
		
		
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
		
		driver.switchTo().defaultContent();
		
		
		
		
		

	}

}
