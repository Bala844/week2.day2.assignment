package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Chrome = driver.findElement(By.xpath("//label[contains(text(),'Chrome')]"));
		Chrome.click();
		Chrome.click();
		Chrome.isSelected();
		WebElement Safari = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td[3]/label"));
		Safari.isSelected();
		WebElement age = driver.findElement(By.xpath("//label[contains(text(),'21-40 Years')]"));
		if(age.isEnabled()) {
			age.click();
		}
		driver.close();
	}
}
