package week2.day1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.client.model.geojson.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	
	     ChromeDriver  driver=new ChromeDriver();
		 
		
		 driver.get("https://en-gb.facebook.com/");		 //Maximize the browser
		 driver.manage().window().maximize();
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 //driver.findElement(By.xpath(//*[@id='u_4_b_nG'])).sendKeys("First Name");		 
		 
	 driver.findElement(By.name("firstname")).sendKeys("Firstname1");
	 driver.findElement(By.name("lastname")).sendKeys("Surname1");
	 driver.findElement(By.name("reg_email__")).sendKeys("Vani@testleaf.com");
	 
	 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Vani@testleaf.com");
	 //driver.findElement(By.name("reg_passwd__")).sendKeys("Vani@123");
	 driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("Vani@123");
		 
	
	
	 
	 WebElement daylist=driver.findElement(By.id("day"));
	 Select day=new Select(daylist);
	 day.selectByIndex(02);
	 
	 
	 
	 WebElement Monthlist = driver.findElement(By.id("month"));
	 Select  month=new Select(Monthlist);
	 month.selectByIndex(4);
	 
	 
	 
		WebElement Yearlist = driver.findElement(By.id("year"));
		Select year=new Select(Yearlist);	
		 year.selectByValue("1984");
	 
	 List<WebElement> radiobutton=driver.findElements(By.xpath("//input[@type='radio']"));

	radiobutton.get(0).click();
	 	 
	 driver.findElement(By.name("websubmit")).click();
	
	}
}
