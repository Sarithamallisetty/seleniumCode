package sample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\it\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement radio1=driver.findElement(By.id("vfb-7-2"));
		WebElement radio2=driver.findElement(By.id("vfb-7-1"));
		
		radio1.click();
		System.out.println("Radio1 button is selected");
		
		radio2.click();
		System.out.println("Radio2 button is selected");
		
		WebElement checkbox= driver.findElement(By.name("webform"));
		checkbox.click();
		
		if(checkbox.isSelected()){
			System.out.println("enable");
		}
		else {
			System.out.println("disabled");
		}
			
		
		driver.get("http://demo.guru99.com/test/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }	
		

	}

}
