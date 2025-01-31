import java.util.Map;

import org.openqa.selenium.Proxy;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.HashMap;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;



//public class Miscelleanous {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//
//		 
//
//
//		 System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
//		
//		//	driver.manage().deleteCookieNamed("sessionKey");
//		
//		//click on any link
//			//login page- verify login url
//			
//			
//			driver.get("http://google.com");
//			
//			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
			
//		    
//		
//	}
//
//}

public class ChromeOptionCode {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		Proxy proxy = new Proxy();

		proxy.setHttpProxy("ipaddress:4444");

		options.setCapability("proxy", proxy);

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);

// FirefoxOptions options1 = new FirefoxOptions();

// options1.setAcceptInsecureCerts(true);

// EdgeOptions options2 = new EdgeOptions();

		options.setAcceptInsecureCerts(true);
		
		

		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());

	}

}

//import java.io.IOException;
//
//import java.net.HttpURLConnection;
//
//import java.net.MalformedURLException;
//
//import java.net.URL;
//
//import java.net.URLConnection;
//
//import java.util.List;
//
//
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.testng.Assert;
//
//import org.testng.asserts.SoftAssert;
//
//
//
//public class BrokenLinks {
//
//
//
//public static void main(String[] args) throws MalformedURLException, IOException {
//
//// TODO Auto-generated method stub
//
//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//
//         WebDriver driver=new ChromeDriver();
//
//         
//
//         //broken URL
//
//         //Step 1 - IS to get all urls tied up to the links using Selenium
//
//         //  Java methods will call URL's and gets you the status code
//
//         //if status code >400 then that url is not working-> link which tied to url is broken
//
//         //a[href*="soapui"]'
//
//         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//
//         
//
//         
//
//      List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//
//      SoftAssert a =new SoftAssert();
//
//     
//
//      for(WebElement link : links)
//
//      {
//
//       
//
//          String url= link.getAttribute("href");
//
//         
//
//          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
//
//          conn.setRequestMethod("HEAD");
//
//          conn.connect();
//
//          int respCode = conn.getResponseCode();
//
//          System.out.println(respCode);
//
//          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
//
//         
//
//     
//
//      }
//
//     
//
//      a.assertAll();
//}
