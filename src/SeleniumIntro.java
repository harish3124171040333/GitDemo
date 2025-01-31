import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		//Firefox

		//System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

		//WebDriver driver1 = new FirefoxDriver();



		//Microsoft Edge

		//System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		//WebDriver driver2 = new EdgeDriver();
		chrome.get("https://rahulshettyacademy.com");

		System.out.println(chrome.getTitle());

		System.out.println(chrome.getCurrentUrl());

		chrome.close();

		//driver.quit();
		
		int arr[] = new int[5];
//		
//		System.out.print(arr[1]);
		
		

	}

}
