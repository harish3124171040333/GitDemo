
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Locators3 {



public static void main(String[] args) {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
}
}

//*****************************************************************
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//
//public class WindowActivities {
//
//
//
//public static void main(String[] args) {
//
//// TODO Auto-generated method stub
//
//
//
//
//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
//
//WebDriver driver = new ChromeDriver();
//
//driver.manage().window().maximize();
//
//driver.get("http://google.com");
//
//driver.navigate().to("https://rahulshettyacademy.com");
//
//driver.navigate().back();
//
//driver.navigate().forward();
//
//
//
//
//
//
//}
//
//
//
//}
//

//driver.findElement(By.id("divpaxinfo")).click();
//
//Thread.sleep(2000L);
//
//
///*int i=1;
//
//while(i<5)
//
//{
//
//driver.findElement(By.id("hrefIncAdt")).click();
//
//i++;
//
//}*/
//
//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//
//for(int i=1;i<5;i++)
//
//{
//
//driver.findElement(By.id("hrefIncAdt")).click();
//
//}
//
//
//driver.findElement(By.id("btnclosepaxoption")).click();
//
//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//
//System.out.println(driver.findElement(By.id("divpaxinfo")).getText(
