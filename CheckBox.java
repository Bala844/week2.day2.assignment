package week2.day2.assignments;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Basic')]/parent::div/div[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Ajax')]/parent::div/div[2]")).click();
		WebElement alert = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		System.out.println(alert.getText());
		driver.findElement(By.xpath("//table[@class='ui-selectmanycheckbox ui-widget']/tbody/tr/td/div[1]/div[2]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText());
		WebElement disabledCheckbox = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']"));
		System.out.println(disabledCheckbox.isEnabled());
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//ul[@role='group']/li[1]")).click();
		driver.close();
		
	}

}
