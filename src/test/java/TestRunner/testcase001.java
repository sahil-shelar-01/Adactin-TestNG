package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.baseclass;

public class testcase001 extends baseclass {

	@Test
	public void tc1(){
		String actual_title = driver.getTitle();
		String cur_title = "Adactin.com - Search Hotel";
		Assert.assertEquals( actual_title, cur_title,  "Adactin.com - Search Hotel" );
		System.out.println(actual_title);
	}
	
	@Test
	public void tc2() throws InterruptedException {
		driver.findElement(By.xpath("//select[@id='location']")).sendKeys("Melbourne");
		driver.findElement(By.xpath("//select[@id='hotels']")).sendKeys("Hotel Sunshine");
		driver.findElement(By.xpath("//select[@id='room_type']")).sendKeys("Deluxe");
		driver.findElement(By.xpath("//select[@id='room_nos']")).sendKeys("2 - Two");
		driver.findElement(By.xpath("//input[@class='date_pick']")).sendKeys("14/09/2022");
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("15/09/2022");
		driver.findElement(By.xpath("//select[@id='adult_room']")).sendKeys("2 - Two");
		driver.findElement(By.xpath("//select[@id='child_room']")).sendKeys("0 - None");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void tc3() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void tc4() throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Sahil");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Shelar");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("At post XYZ");
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("4545636389871111");
		driver.findElement(By.xpath("//select[@id='cc_type']")).sendKeys("VISA");
		driver.findElement(By.xpath("//select[@id='cc_exp_month']")).sendKeys("May");
		driver.findElement(By.xpath("//select[@id='cc_exp_year']")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("451");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		}
		
	@Test
	public void tc5() {
		WebElement orderNo = driver.findElement(By.xpath("//input[@id='order_no']"));
		System.out.println("The order no is : " +orderNo.getAttribute("value"));
	}
	}

