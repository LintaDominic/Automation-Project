package page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BurgerKingLoginPage {
	WebDriver driver;
	By bklogin=By.xpath("//*[@id='root']/div[1]/ul/li[3]/span");
By bkmobileno=By.id("mobileNumber");
By bkgetotp=By.xpath("//*[@id='root']/div[2]/div/div[1]/div/div/div/div[2]/div[2]/button");
By bkotp=By.id("value");
By bkverifyotp=By.xpath("//*[@id='root']/div[2]/div/div[1]/div/div/div/div[2]/div[3]/button");


public BurgerKingLoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public void login()
{
	driver.findElement(bklogin).click();
}
public void setmobile(String mobileno)
{

	driver.findElement(bkmobileno).sendKeys(mobileno);
}
public void getotp() {
	driver.findElement(bkgetotp).click();
}
public void setotp()
{
	
System.out.print("Enter OTP: ");
Scanner scanner = new Scanner(System.in);
String otp = scanner.nextLine();
scanner.close();

driver.findElement(bkotp).sendKeys(otp);
}
public void verify()
{
	
	
	driver.findElement(bkverifyotp).click();
}


}
