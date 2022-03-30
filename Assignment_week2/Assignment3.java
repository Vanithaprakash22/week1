package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/button")).click();
		 
	
	
	//driver.findElement(By.className("btn btn-primary")).click();
	
	driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	
	
	
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.close();
	
		
	}
	
	

}
