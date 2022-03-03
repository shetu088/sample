package objects;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import connections.TestBase;


public class ObjectClass extends TestBase{

	@FindBy(xpath="//input[@name='searchVal']")
	protected WebElement enterjeans;

	@FindBy(xpath="//div[@class ='item rilrtl-products-list__item item']")
	protected List<WebElement> opt;

	
	public ObjectClass()
	{   
		setup();
		PageFactory.initElements(driver, this);
		
	}
	public void GetTitle()
	{
		System.out.println("The Title of the page is :" + driver.getTitle());
		
		
	}
	
	public void Enterjeans()
	{
		enterjeans.sendKeys("jeans");
	}
	
	public void Search()
	{
		enterjeans.sendKeys(Keys.CONTROL,Keys.ENTER);
	}
	
	public void FirstSixJeans()
	{
		List<WebElement> options =opt;
		//driver.findElements(By.xpath("//div[@class ='item rilrtl-products-list__item item']"));
		   int count = 0;
		   for(WebElement options1 : options)
				{
				    
					if(count<6)
					{
						
					String text = options1.getText();
					System.out.println(text);
					count++;
					}
				}
	}
	
	public void PrintNameActualPriceDiscountedPrice()
	{
		for(int i=1 ; i<=6;i++)
			{
			
			
			
			WebElement name=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div["+i+"]/a[1]/div/div[2]/div[2]"));
	
	   WebElement dp=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div["+i+"]/a[1]/div[1]/div[2]/div[3]/span[1]"));
			
		WebElement actualprice=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div["+i+"]/a[1]/div[1]/div[2]/div[3]/div/span[1]"));
		
		String name1 = name.getText();
		String discountedPrice1 = dp.getText();
		String actualprice1 = actualprice.getText();
		
		System.out.println("The Name ,DiscountedPrice and ActualPrice of the"+i+ "jeans are :" +name1 +"," +discountedPrice1+","+actualprice1);
		
	}
	
	}
		public void FindHighestPrice()
		{
			TreeSet<Integer>set=new TreeSet<>();
			System.out.println("Price of Jeans::::");
			
			for(int i=1;i<=6;i++)
			{
			WebElement temp=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div["+i+"]/a[1]/div[1]/div[2]/div[3]/div/span[1]"));
			
			String cost=temp.getText();  
			String c[]=cost.split(" ");
			
			System.out.println("Cost of every Jeans");
			System.out.println(cost);
			set.add(Integer.parseInt(c[1].replace(",","")));
			}
			System.out.println("**********************************************");
			System.out.println("Highest priced Jeans COST::: "+set.last());

		}
	public void CloseTheBrowser()
	{
		driver.close();
	}
}