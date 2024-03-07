package JavaBasic;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaClass {
	WebDriver driver = new ChromeDriver();
	String MyWebsite="";
	
@BeforeTest
  public void myBeforeTest() {
	
	driver.manage().window().maximize();
	
//	String myName= "daybreak";
//	System.out.println( myName.contains("t"));  
	
	
	
	
	
}


@Test(invocationCount = 8)
  public void firstTest() throws InterruptedException {
	
    String firstName="tabarak";
    String lastName="Aburajab";
    String domain = "@gmail.com";
    String num="7971200899";
    String gender="Female";
    String passworrd="1234assd";
    String passworrdghlk="1234assd";

    Random rand= new Random();
    int randomID= rand.nextInt(20);
  //  System.out.println(firstName+lastName+randomID+domain);
	driver.get("");
	Thread.sleep(2000);
	driver.findElement(By.id("")).sendKeys(firstName+lastName+randomID+domain);
    driver.findElement(By.id("")).sendKeys(num);
	driver.findElement(By.id("")).sendKeys(gender);
	driver.findElement(By.id("")).sendKeys(firstName);
	driver.findElement(By.id("")).sendKeys(lastName);
	driver.findElement(By.id("")).sendKeys(passworrd);
	driver.findElement(By.id("")).click();

	Thread.sleep(2000);

	
	
	
	
}




















}


