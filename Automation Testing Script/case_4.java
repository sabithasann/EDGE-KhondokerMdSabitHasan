//Take Appointment
package day_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class case_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabit\\libs\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://pioneerhealthcare.somee.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.name("UserName")).sendKeys("EDGE");
		driver.findElement(By.name("Password")).sendKeys("***");
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.linkText("Take Appointment")).click();
		
		
        WebElement chamberDropdown = driver.findElement(By.id("chamberSelect")); 
        Select selectChamber = new Select(chamberDropdown);
        selectChamber.selectByVisibleText("Basundhara");
        
        Thread.sleep(1000);

        WebElement timeDropdown = driver.findElement(By.id("appointmentTime")); 
        Select selectTime = new Select(timeDropdown);
        selectTime.selectByVisibleText("09:00 AM");
        
        
        driver.findElement(By.id("appoinmentBtn")).click();
		
        
		String actual = driver.getCurrentUrl();
		String desiredURL = "https://pioneerhealthcare.somee.com/Patient";
		
		if(actual.equals(desiredURL))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//driver.close();
		//driver.quit();

	}

}
