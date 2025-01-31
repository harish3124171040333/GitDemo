import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		String currentDate = "08-07-2000";
		
		

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Harish");
		driver.findElement(By.name("email")).sendKeys("Harish@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("saravanan");
		driver.findElement(By.id("exampleCheck1")).click();
		Select dropDown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		dropDown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//*[@name=\"bday\"]")).sendKeys("" + currentDate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		String success = driver.findElement(By.className("alert")).getText();
		System.out.println(success.split("×")[1]);
		
		
		
		
		

	}

}
