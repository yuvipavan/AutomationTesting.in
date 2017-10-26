import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration {
	
WebDriver driver;
	
     @BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Onedrive\\Selenium sws\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	

     @Test
     public void Registration1() throws Exception
     {
    	 
    	 //Textbox Code Below:
        WebElement FirstName = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
 		FirstName.sendKeys("Pavan");
 		//------------------------------------------------------------------------------------
 		WebElement LastName = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));
 		LastName.sendKeys("Kumar");
 		//------------------------------------------------------------------------------------
 		WebElement Address = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
 		Address.sendKeys("Nad junction,Vizag");
 		//------------------------------------------------------------------------------------
 		
 		//Random Class Code Below:
 		Random r = new Random();
 		String email = "email"+r.nextInt(10000)+"@gmail.com";
 		
 		WebElement Email = driver.findElement(By.xpath(".//*[@id='eid']/input"));
 		Email.sendKeys(email);
 		//------------------------------------------------------------------------------------
 		WebElement Phone = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[4]/div/input"));
 		Phone.sendKeys("8901227475");
 		//------------------------------------------------------------------------------------
 	    WebElement Gender = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));
 		Gender.click();
 		//------------------------------------------------------------------------------------
 		WebElement Hobbies = driver.findElement(By.id("checkbox1"));
 		Hobbies.click();
 		
 		
 		//Select Class Code Below:
 		WebElement Skills = driver.findElement(By.xpath(".//*[@id='Skills']"));
		Select dropdown= new Select(Skills);
		dropdown.selectByIndex(3);
		//------------------------------------------------------------------------------------
		WebElement Country = driver.findElement(By.xpath(".//*[@id='countries']"));
		Select dropdown1= new Select(Country);
		dropdown1.selectByIndex(4);
		
		//------------------------------------------------------------------------------------
		WebElement SelectCountry = driver.findElement(By.id("country"));
		Select dropdown2= new Select(SelectCountry);
		dropdown2.selectByIndex(5);
		
		// Date Time Picker Code Below:
		WebElement Year = driver.findElement(By.xpath(".//*[@id='yearbox']"));
		Select dropdown3= new Select(Year);
		dropdown3.selectByIndex(4);
		WebElement Month = driver.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));
		Select dropdown4= new Select(Month);
		dropdown4.selectByIndex(4);
		WebElement Date = driver.findElement(By.xpath(".//*[@id='daybox']"));
		Select dropdown5= new Select(Date);
		dropdown5.selectByIndex(4);
		
		//-------------------------------------------------------------------------------------
		WebElement Password = driver.findElement(By.xpath(".//*[@id='firstpassword']"));
		Password.sendKeys("P@ssw0rd");
		WebElement ConfirmPassword = driver.findElement(By.xpath(".//*[@id='secondpassword']"));
		ConfirmPassword.sendKeys("P@ssw0rd");
		
		//-------------------------------------------------------------------------------------
		WebElement Submit = driver.findElement(By.xpath(".//*[@id='submitbtn']"));
		Submit.click();
		
 		
 	
 		Thread.sleep(5000);
    	 
     }
     
     
     
     
}
