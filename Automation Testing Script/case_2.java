//Signup
package day_1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class case_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabit\\libs\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://pioneerhealthcare.somee.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Signup")).click();
		
		driver.findElement(By.name("UserName")).sendKeys("EDGE");
		driver.findElement(By.name("Email")).sendKeys("edge@gmail.com");
		driver.findElement(By.name("Phone")).sendKeys("01812345678");
		driver.findElement(By.name("Password")).sendKeys("***");
		driver.findElement(By.name("RePassword")).sendKeys("***");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("signupBtn")));
        
        Thread.sleep(500);
		
		driver.findElement(By.id("signupBtn")).click();
		
		String actual = driver.getCurrentUrl();
		String desiredURL = "https://pioneerhealthcare.somee.com/User/Login";
		
		if(actual.equals(desiredURL))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//driver.close();
		//driver.quit();	
	}

}
