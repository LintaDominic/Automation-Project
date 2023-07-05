package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.searchpage;

public class searchtest extends Baseclass1{
	@Parameters("search")
@Test
public void seachtest(String s)
{
	searchpage ob=new searchpage(driver);
	ob.searchicon();
	ob.searchtext(s);
}
}
