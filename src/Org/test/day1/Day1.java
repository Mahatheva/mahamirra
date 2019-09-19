package Org.test.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahat\\eclipse-workspace\\Dayproject\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		WebElement name = d.findElement(By.id("twotabsearchtextbox"));
		name.sendKeys("oneplus 7");
		WebElement serclk = d.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		serclk.click();
		List<WebElement> e = d.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int s = e.size();
		System.out.println(s);
		for(WebElement x : e) {
			String t = x.getText();
			System.out.println(t);
			
		}
		Thread.sleep(5000);
		e.get(2).click();
		
		
		
	}
	

}
