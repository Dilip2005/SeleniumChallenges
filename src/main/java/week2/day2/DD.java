package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DD {

	public static void main(String[] args) throws InterruptedException {
		
		  ChromeDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://www.telerik.com/contact"); 
		  //option tag if you have id/name presented you can go directly click on value
		  driver.findElement(By.xpath("//option[text()='Product questions']")).click();
		 
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--disable-notifications");
		 * options.addArguments("--start-maximized"); ChromeDriver driver = new
		 * ChromeDriver(options);
		 * 
		 * // Launch the url https://www.pvrcinemas.com/
		 * driver.get("https://www.pvrcinemas.com/");
		 * 
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 * 
		 * 
		 * //
		 * driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys(
		 * "Chennai"); //
		 * driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		 * 
		 * Thread.sleep(6000); // Click on Cinema WebElement j =
		 * driver.findElement(By.xpath("(//div[@class='date-show']/span)[2]"));
		 * j.click();
		 * 
		 * 
		 * 
		 * // Select Cinima
		 * 
		 * driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		 * 
		 * driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[2]")).
		 * click();
		 * 
		 * // Select Date
		 * 
		 * driver.findElement(By.xpath("//span[contains(text(), 'Tomorrow')]")).click();
		 * 
		 * // Select movie
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).
		 * click();
		 * 
		 * // Select show time
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElements(By.xpath("(//li[@class='p-dropdown-item']/span)[1]"));
		 * 
		 * 
		 * 
		 * 
		 * // Click the book button
		 * 
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 * 
		 * // Click Accept button
		 * 
		 * driver.findElement(By.xpath("//button[text()='Accept']")).click();
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.xpath("//button[text()='Accept']")).click();
		 * 
		 * // Choose Seat
		 * 
		 * driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])")).click();
		 * 
		 * // Print summary
		 * 
		 * String summary =
		 * driver.findElement(By.className("summary-movies-content")).getText();
		 * 
		 * System.out.println("Booking summary: "+summary);
		 * 
		 * // Print Select seat number
		 * 
		 * String seatNo =
		 * driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		 * 
		 * System.out.println("Booking Seat No: "+seatNo);
		 * 
		 * // Print total amount
		 * 
		 * String price = driver.findElement(By.className("grand-prices")).getText();
		 * 
		 * System.out.println("Grand Total 1: "+price);
		 * 
		 * // Click Proceed button
		 * 
		 * driver.findElement(By.xpath("//div[@class='register-btn']/button")).click();
		 * 
		 * // Print grand total
		 * 
		 * String text = driver.findElement(By.
		 * xpath("//div[@class='grand-tota col-md-3']//following::span")).getText();
		 * 
		 * System.out.println(text);
		 * 
		 * if (price.contains(text)) {
		 * 
		 * System.out.println("Both are same");
		 * 
		 * }
		 * 
		 * 
		 * driver.findElement(By.xpath("(//i[@class='pi pi-times'])")).click();
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * // driver.close();
		 */	}

}
