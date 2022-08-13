package Week2.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingaLead {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Create Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prathap");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
       driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rishi");
       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Electronics & Communication");
       driver.findElement(By.id("createLeadForm_description")).sendKeys("Company serves as an instant search engine to the world");
       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prathapravi@gmail.com");
       driver.findElement(By.className("smallSubmit")).click();
       String title = driver.getTitle();
       System.out.println(title);
       
       
       
	}

}
