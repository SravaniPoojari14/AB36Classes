package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Instagram 
{
public static void main(String[] args) 
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	WebElement w1 =driver.findElement(By.xpath("(//input)[1]"));
	w1.sendKeys("sravanisubramanyam14@gmail.com");
	w1.sendKeys(Keys.ENTER);
	WebElement w2 =driver.findElement(By.xpath("(//input)[2]"));
	w2.sendKeys("123@14");
	w2.sendKeys(Keys.ENTER);
	
	
			
	
}
}
