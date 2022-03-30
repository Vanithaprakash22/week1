package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment2 {

	public static void main(String[] args) {
	
	
		WebDriverManager.chromedriver().setup(); // static

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximize the browser
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Vani1");
		driver.findElement(By.id("lastNameField")).sendKeys("prak1");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Vanu");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("prakk");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("New account created");
		driver.findElement(By.name("primaryEmail")).sendKeys("test@abc.com");
	
		 
		 WebElement Statelist = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select state=new Select(Statelist);	
			 
			 state.selectByVisibleText("New York");
			 
				driver.findElement(By.className("smallSubmit")).click();
				
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.name("description")).clear();
				driver.findElement(By.name("importantNote")).sendKeys("Fill area");
				driver.findElement(By.xpath("//input[@name='submitButton'][@value='Update']")).click();
				String title=driver.getTitle();
				System.out.println(title);
				
	}
		
		
}
