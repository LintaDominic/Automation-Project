package test;

import java.io.IOException;

import org.testng.annotations.Test;

import page.Ourmenupage;

public class Ourmenutest extends Baseclass1{
@Test
public void seealltest() throws IOException
{
Ourmenupage ob=new Ourmenupage(driver);	
ob.seeAll();
ob.title();
ob.link();
ob.logo();
ob.alert();
ob.screenshot();

}
}

