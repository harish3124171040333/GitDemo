import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class RelativeLocator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//
//		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
//
//		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
//
//		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
//
//		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
//
//		WebElement iceCreamLabel = driver
//				.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
//
//		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
//
//		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
//
//		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Switching Window

		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();

		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		driver.get("https://rahulshettyacademy.com/");

		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

				.get(1).getText();

		driver.switchTo().window(parentWindowId);

		WebElement name = driver.findElement(By.cssSelector("[name='name']"));

		name.sendKeys(courseName);

		// Screenshot

		File file = name.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("logo.png"));

		// driver.quit();

		// GEt Height & Width

		System.out.println(name.getRect().getDimension().getHeight());

		System.out.println(name.getRect().getDimension().getWidth());

	}

}
