package test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.BurgerKingLoginPage;

public class bklogintest extends Baseclass1 {

@Test
public void bktest() 
{
BurgerKingLoginPage ob=new BurgerKingLoginPage(driver);
ob.login();
ob.setmobile("9711831558");
ob.getotp();
ob.setotp();

ob.verify();
}
}
