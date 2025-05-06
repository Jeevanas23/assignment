package week2.day1;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchORM {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		//driver. manage().timeouts().implicitlyWait(Duration.ofseconds(30));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();




		}
	}

