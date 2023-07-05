package page;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logindatadrivenpage {
	WebDriver driver;
	By bklogin=By.xpath("//*[@id='root']/div[1]/ul/li[3]/span");
By bkmobileno=By.id("mobileNumber");

public logindatadrivenpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void login()
{
	driver.findElement(bklogin).click();
}
public void datadrivenTest() throws IOException
{
	FileInputStream f=new FileInputStream("C:\\Users\\mjcma\\Documents\\Software Testing\\Rugma mam\\Book4.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(f);
XSSFSheet sh=wb.getSheet("Sheet1");
int row=sh.getLastRowNum();
for(int i=1;i<=row;i++)
{
	//int MobileNo=(int)sh.getRow(i).getCell(0).getNumericCellValue();
	//String Number=String.valueOf(MobileNo)
	double MobileNo=sh.getRow(i).getCell(0).getNumericCellValue();
	int no=(int)MobileNo;
	String Number=String.valueOf(no);
	driver.findElement(bkmobileno).clear();
	driver.findElement(bkmobileno).sendKeys(Number);
	
}
}
}
