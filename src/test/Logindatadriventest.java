package test;

import java.io.IOException;

import org.testng.annotations.Test;

import page.logindatadrivenpage;

public class Logindatadriventest extends Baseclass1 {
	@Test
	public void bktest() throws IOException 
	{
		logindatadrivenpage ob=new logindatadrivenpage(driver);
		ob.login();
		ob.datadrivenTest();
}
}
