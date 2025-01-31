import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();

		String checkBoxName = "";

		List<WebElement> checkBoxNameList = driver.findElements(By.xpath("//label/input[@type = \"checkbox\"]"));
		int i = 0;

		for (WebElement checkBoxNameChecking : checkBoxNameList) {
			i++;

			if (checkBoxNameChecking.isSelected()) {
				checkBoxName = driver
						.findElement(By.xpath("//label[" + i + "]/input[@type = 'checkbox']/parent:: label")).getText();
			}

		}

		System.out.println(checkBoxName);

		Select option = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));

		option.selectByVisibleText(checkBoxName);

		driver.findElement(By.name("enter-name")).sendKeys(checkBoxName);

		driver.findElement(By.cssSelector("[onclick=\"displayAlert()\"]")).click();

		String alertText = driver.switchTo().alert().getText();

		System.out.println(alertText);

		if (alertText.contains(checkBoxName)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
