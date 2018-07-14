package Com.C_Password;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChangePassword {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", "D:\\T\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/index.php");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr128881");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("vali@143");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Change Password")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("vali@143");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")).sendKeys("vali@1143");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("vali@1143");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")).click();
		driver.switchTo().alert().accept();
		
	}

	}


