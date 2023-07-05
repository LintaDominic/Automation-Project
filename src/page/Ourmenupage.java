package page;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class Ourmenupage {
WebDriver driver;
By seeall=By.xpath("//*[@id='root']/div[3]/div[2]/section/div[1]/div");
By linkcount=By.tagName("a");
By cart=By.xpath("//*[@id=\"root\"]/div[1]/ul/li[4]/span");
By log=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/img");
By butt=By.xpath("//*[@id=\"root\"]/div[1]/ul/li[1]/span");
public Ourmenupage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void seeAll()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(seeall).click();
}
public void title()
{
	String actualttile=driver.getTitle();
	System.out.println(actualttile);
}
public void link()
{
List<WebElement> links=driver.findElements(linkcount);
System.out.println("total no of links="+links.size());
 for(WebElement u:links){
	
	 String link=u.getAttribute("href");
	 String linktext=u.getText();
	 System.out.println(link+"------"+linktext);
	 }
	 
}
public void logo()
{
	
	boolean logo=driver.findElement(log).isDisplayed();
	if(logo)
	{
		System.out.println("logo is present");
		
	}
	else
	{
		System.out.println("logo is not present");
	}
}
public void alert()
{
	driver.findElement(cart).click();
	Alert a=driver.switchTo().alert();
	a.accept();
	
}
public void screenshot() throws IOException
{
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:\\Users\\mjcma\\Documents\\Software Testing\\sc.png"));
	WebElement button=driver.findElement(butt);
	File src1=button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, new File("./scrnshot/bk.png"));

}

}