	import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDemo1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
//		WebElement text=driver.findElement(By.name("q"));
		
//		WebElement searchBox=driver.findElement(By.name("q"));
		
//		text.sendKeys("i am feeling awesome");
//		text.clear();
//		searchBox.sendKeys("i am feeling awesome");
//		Thread.sleep(3000);
//		WebElement searchBox1=driver.findElement(By.name("ta1"));
//		
//		searchBox.clear();
/*// this is for finding the area name
 * 
 * 
		String text=driver.findElement(By.id("ta1")).getText();
		System.out.println(text);   */
//		navbar
		/*// this is for knowing the title
		String title=driver.getTitle();
		System.out.println(title);  */
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
		
		
		/*    // this is for finding the navigated page url
		  
		  
		 
		WebElement text=driver.findElement(By.linkText("onlytestingblog"));
		text.click();
		String url=driver.getCurrentUrl();
		System.out.println(url);                */  
//		Thread.sleep(5000); 
		
		/*  // close and quit is used to close the browser automatically
		 * here sleep means time taken
		driver.close();         */
		
    /*  here it is checking the displayed Elements are true or false
     
       
       //		driver.quit();
		boolean displayed = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println(displayed);
		Thread.sleep(5000);
		driver.quit();
		
		
		
		boolean enable = driver.findElement(By.id("but1")).isEnabled();
		System.out.println(enable);
		Thread.sleep(5000);
		driver.quit();           */
//
//		boolean select = driver.findElement(By.id("checkbox2")).isSelected();
//		System.out.println(select);
//		Thread.sleep(5000);
//		driver.quit();
		
		
		
////		this is for knowing the attribute name 
//		String atributeText= driver.findElement(By.id("alert1")).getAttribute("type");
//		System.out.println(atributeText);
		
		
		
////		this for navigation and forward and get back to the page
//		driver.navigate().to("https://www.youtube.com/");
//		Thread.sleep(5000);
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//		driver.close();
//		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String>windows = driver.getWindowHandles();
		String mainWindowId=itr.next();
		String childWindow=itr.next();
		driver.switchTo().window(childWindow);
		String textOnChildWindow=driver.findElement(By.xpath("//body/h2")).getText();
		System.out.println(textOnChildWindow);
		
	
	}

}
