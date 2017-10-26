import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownRepo {
	
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
    public void DropDownUsingList()
    {
    	driver.findElement(By.xpath("//*[@id='Skills']")).click();
    	List<WebElement> SkillStorage = driver.findElements(By.xpath("//*[@id='Skills']/option"));
		for(WebElement Skillstorage2:SkillStorage)
		{
			if(Skillstorage2.getText().equals("C") )	
			{
				
				Skillstorage2.click();
				System.out.println("passed");
				//WebElement drpselect = driver.findElement(By.xpath(".//*[@id='Skills']"));
			//	drpselect.sendKeys("C");
				break;
			}
		}
    	
    }
	
    
    

}
