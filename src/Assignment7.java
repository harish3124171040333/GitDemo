import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");

		int columnSize = driver.findElements(By.xpath("//table[@name=\"courses\"]/tbody/tr/th")).size();

		int rowSize = driver.findElements(By.xpath("//table[@name=\"courses\"]/tbody/tr")).size();

		System.out.println(columnSize);
		System.out.println(rowSize);
		List<WebElement> contents = driver.findElements(By.xpath("//table[@name=\"courses\"]/tbody/tr[3]/td"));

		for (WebElement content : contents) {
			String value = content.getText();
			System.out.println(value);
		}

	}

}
