package org.adatacin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\BaseclassAdatacin\\driver\\chromedriver.exe");
          driver=new ChromeDriver();
          driver.get(url);
          driver.manage().window().maximize();
	}
	public void login(String id,String username) {
		driver.findElement(By.id(id)).sendKeys(username);
	}
	public void passWord(String id2,String pwd) {
		driver.findElement(By.id(id2)).sendKeys(pwd);
		}
	public void clk(String ck) {
		driver.findElement(By.id(ck)).click();
			}
	
	
	public void loc(String id,String location) {
		driver.findElement(By.id(id)).sendKeys(location);
	}
	public void rooms(String id,String numberofroom) {
		driver.findElement(By.id(id)).sendKeys(numberofroom);
	}
	public void entryDate(String id,String checkin) {
		driver.findElement(By.id(id)).sendKeys(checkin);
	}
	public void exitDate(String id,String checkout) {
		driver.findElement(By.id(id)).sendKeys(checkout);
	}
	public void adult(String id,String adults) {
		driver.findElement(By.id(id)).sendKeys(adults);
	}
}
//
//