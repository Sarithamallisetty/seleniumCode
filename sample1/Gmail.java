package sample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("ammuadyasree123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.findElement(By.name("password")).sendKeys("Sairam@123");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\":3d\"]/div/div")).click();
		driver.findElement(By.name("to")).sendKeys("ammuadyasree123@gmail.com");
		driver.findElement(By.id(":5s")).click();
		driver.findElement(By.id(":90")).sendKeys("adyasree143@gmail.com");
		driver.findElement(By.id(":8h")).sendKeys("Application for Test engineer");
		driver.findElement(By.id(":9m")).sendKeys("Hi Vidhya, I am intrested in this job position.");
		driver.findElement(By.id(":9z")).click();
		Thread.sleep(2000);
		
		
	}

}
