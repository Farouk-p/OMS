package com.oms.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.oms.base.TestBase;

public class PlaceOrder extends TestBase {
	
	@Test
	public void loginToStore () throws InterruptedException {
		
		
		
		driver.get(config.getProperty("StoreUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 5);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement phoneNumber;
		WebElement LoginWithPWD;
		WebElement Password;
		WebElement Proceed;		
		WebElement RememberMe;
		
		
		phoneNumber = driver.findElement(By.xpath(OR.getProperty("PhoneNo_XPATH")));
		phoneNumber.sendKeys(OR.getProperty("PhoneNo"));
		LoginWithPWD = driver.findElement(By.xpath(OR.getProperty("LoginWithPWD_XPATH")));
		LoginWithPWD.click();
		Password = driver.findElement(By.xpath(OR.getProperty("Password_XPATH")));
		Password.sendKeys(OR.getProperty("Password"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("RememberMe_XPATH"))));
		Thread.sleep(4000);
		RememberMe = driver.findElement(By.xpath(OR.getProperty("RememberMe_XPATH")));
		RememberMe.click();
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,800)");
		Proceed = driver.findElement(By.xpath(OR.getProperty("ProceedBtn_RXPATH")));
		//Proceed.click();
		Actions actions = new Actions(driver);
		
		actions.moveToElement(Proceed).click().build().perform();
	
		//Proceed = driver.findElement(By.xpath(OR.getProperty("ProceedBtn_RXPATH")));
		//Proceed.click();
		
		
		
		
		
	}
}
