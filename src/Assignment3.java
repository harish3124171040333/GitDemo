import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		List<WebElement> list = driver.findElements(By.xpath("//p[@class=\"text-center text-white\"]/b/i"));

		String userName = list.get(0).getText();

		driver.findElement(By.id("username")).sendKeys(userName);

		driver.findElement(By.id("password")).sendKeys(list.get(1).getText());

		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

		Select option = new Select(driver.findElement(By.cssSelector("[data-style=\"btn-info\"]")));

		option.selectByVisibleText("Consultant");

		driver.findElement(By.cssSelector("#terms")).click();

		driver.findElement(By.cssSelector("#signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-info i")));

		List<WebElement> cartDetails = driver.findElements(By.cssSelector(".btn-info i"));

		for (WebElement cart : cartDetails) {
			cart.click();
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-link.btn.btn-primary")));

		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();

	}

}
