package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class OneTest {
	WebDriver d;
	@Test
	public void mOne() throws InterruptedException
	{   System.out.println("class one exicuted");
		//WebDriverManager.chromedriver().setup();
	    d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Assert.assertEquals(d.findElement(By.xpath("//p[@id='pah']")).getText(),"PracticeAutomationHere");
		
		
	}
	@AfterMethod
	public void mne() throws InterruptedException
	{
		Thread.sleep(3000);
		d.quit();	
	}
}
/*
   <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties>
  */
