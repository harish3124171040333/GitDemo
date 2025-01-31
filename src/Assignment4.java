import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {

// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Downloads/chromedriver");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
//
//		driver.findElement(By.cssSelector(".blinkingText")).click();
//
//		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]
//
//		Iterator<String> it = windows.iterator();
//
//		String parentId = it.next();
//
//		String childId = it.next();
//
//		driver.switchTo().window(childId);
//
//		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//
//		driver.findElement(By.cssSelector(".im-para.red")).getText();
//
//		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
//				.split(" ")[0];
//
//		driver.switchTo().window(parentId);
//
//		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text() = \"Multiple Windows\"]")).click();
		
		
		
		driver.findElement(By.xpath("//a[text() = \"Click Here\"]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> a = windows.iterator();
		
		 String ParentId = a.next();
		
		 String childId = a.next();
		 
		
		
		driver.switchTo().window(childId);
		
		String childText = driver.findElement(By.tagName("h3")).getText();
		
		System.out.println(childText);
		
		driver.switchTo().window(ParentId);
		
		System.out.println(driver.findElement(By.xpath("//*[text() = \"Opening a new window\"]")).getText());
		
		
		
		
		
	
		
		
		
		
		
		
		

	}

}