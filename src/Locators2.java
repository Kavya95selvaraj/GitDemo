import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String name="Kavya";
		String password=getPassword(driver);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		String loggedinText=driver.findElement(By.tagName("p")).getText();
		System.out.println(loggedinText);
		Assert.assertEquals(loggedinText,"You are successfully logged in.");//checking the logged in successful message
		String hellomessage=driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(hellomessage,"Hello "+name+ ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String password1=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(password1);
		String[] password2=password1.split("'");
		System.out.println(password2[0]);
		System.out.println(password2[1]);
		String password=password2[1].split("'")[0];
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		return password;
		
		
		
	}

}
