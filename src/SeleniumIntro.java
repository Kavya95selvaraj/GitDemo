import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

/**
 * 
 */
public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();here driver will have only the knowledge of chromedriver class modules 
		///System.setProperty("webdriver.Chrome.Driver","give driver path");//this step is not necessary
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");//to launch the url
		driver.manage().window().maximize();//To maximize the window
		System.out.println(driver.getCurrentUrl());//to get the current url
		System.out.println(driver.getTitle());//to get the title of the currentpage  
		
		/*
		
		//To run in the edge driver
		System.setProperty("webdriver.edge.Driver","C:\\Users\\Kavya Loganathan\\eclipse-workspace\\Documents\\msedgedriver.exe");//this step is not necessary
				WebDriver driver=new EdgeDriver();
				driver.get("https://rahulshettyacademy.com/");//to launch the url
				driver.manage().window().maximize();//to maximize the window
				System.out.println(driver.getCurrentUrl());//to get the current url
				System.out.println(driver.getTitle());//to get the title of the currentpage
				
				*/

		
		driver.close();//to close the current page
		driver.quit();//will close all the opened browsers for testing
		
		

	}

}
