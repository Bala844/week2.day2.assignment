package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Disabled')]/parent::button")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Submit')]/parent::button")).getLocation());
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Save')]/parent::button")).getCssValue("color"));
		WebElement size = driver.findElement(By.xpath("//h5[contains(text(),'Find the height and width of this button')]/following::button/span[contains(text(),'Submit')]"));
		System.out.println(size.getSize());
		driver.close();
	}

}
