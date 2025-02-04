import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
public class Assignment1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//testing git
		
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption1")).click();
		
		boolean select = driver.findElement(By.id("checkBoxOption1")).isSelected();

		Assert.assertTrue(select);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		select = driver.findElement(By.id("checkBoxOption1")).isSelected();
		
		Assert.assertFalse(select);
		
		int count = driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size();
		
		System.out.println(count);
		
		
		
		
//		
		

	}

}
