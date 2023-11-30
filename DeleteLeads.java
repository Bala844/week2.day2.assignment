package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {

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
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9677081188");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement leadID = driver.findElement(By.xpath("//tbody/tr/td/div/a[@class='linktext']"));
		String id = leadID.getText();
		leadID.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText());
		driver.close();
	}

}
