package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

public class searchpage {
WebDriver driver;
By search=By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/span");
By searchhere=By.xpath("//*[@role='combobox']");
public searchpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void searchicon()
{
	
	driver.findElement(search).click();
}

public void searchtext(String text)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));;
driver.findElement(searchhere).sendKeys(text,Keys.ENTER);
}
}
