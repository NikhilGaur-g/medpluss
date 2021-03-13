package com.valuemomentum.retail.medpluss;


import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class MedPluss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\test\\chrome_driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.medplusmart.com");
		 System.out.println("Title : "+driver.getTitle());
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		        
	        Actions actions = new Actions(driver);
	      
	        WebElement menuOption = driver.findElement(By.xpath("/html/body/header/div[1]/nav[2]/ul/li[1]/a"));
	        actions.moveToElement(menuOption).perform();
	      
	       WebElement selectMenuOption = driver.findElement(By.xpath("/html/body/header/div[1]/div[4]/ul/li[3]/a"));
	        selectMenuOption.click();
	        driver.findElement(By.xpath("//*[@id=\"leftNav_MART_20004\"]/a")).click();
	        System.out.println("Title : "+driver.getTitle());
	        driver.findElement(By.xpath("//*[@id=\"leftNav_MART_30046\"]/a")).click();
	        System.out.println("Title : "+driver.getTitle());
	      //  driver.findElement(By.xpath("//*[@id=\"PriceRange\"]/div[1]/div[1]/div[3]")).click();
	        
	        //JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement Element = driver.findElement(By.xpath("//*[@id=\"PriceRange\"]/div[1]/div[1]"));
	        actions.dragAndDropBy(Element, -40, 0).build().perform();
	        Thread.sleep(1000);

	        driver.findElement(By.xpath("//*[@id=\"SENS0065\"]/div[4]/div[4]/form/div[1]/div[2]/button")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"ORAR0009\"]/div[4]/div[3]/div[1]/form/div[2]/button")).click();
	        driver.findElement(By.xpath("//*[@id=\"microCartQty\"]")).click();
	        
	     
	        String text = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
	       System.out.println("First Product: "+text);
	        Thread.sleep(1000);
	        String text1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
	        System.out.println("Second Product: "+text1);
	        
	        driver.findElement(By.xpath("//*[@id=\"pharmaCheckOutBtn\"]")).click();
	        Thread.sleep(1000);
	        System.out.println("Title : "+driver.getTitle());
	        System.out.println("Are two products equal: "+text.equals(text1));
		 

	}

}
