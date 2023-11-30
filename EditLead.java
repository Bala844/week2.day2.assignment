package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		System.out.println(crmsfa.getText());
		crmsfa.click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//td/input[@name='companyName']")).sendKeys("Acentra");
		driver.findElement(By.xpath("//td/input[@name='firstName']")).sendKeys("Bala");
		driver.findElement(By.xpath("//td/input[@name='lastName']")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//td/input[@name='firstNameLocal']")).sendKeys("Bala");
		driver.findElement(By.xpath("//td/input[@name='departmentName']")).sendKeys("testing");
		WebElement desc = driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"));
		desc.sendKeys("Automation Testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("ganesh.bala844@gmail.com");
		Select state = new Select(driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Automation Testing Edited");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
