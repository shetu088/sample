package stepdef;




import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import objects.ObjectClass;

public class StepAjio {

	
	 ObjectClass object;
    
    @Before
    public void init()
    {
    	object=new ObjectClass();
    }
	
	
	

	
	@Given("user is on the ajio home page")
	public void user_is_on_the_ajio_home_page()
	{
		
		
		object.GetTitle();
	}

	
	@And("user enter the jeans into the search bar")
	public void user_enter_the_jeans_into_the_search_bar()
	
	{
		object.Enterjeans();
	}
	@And("user click on the search button")
	public void user_click_on_the_search_button() 
	{
		object.Search();
		
		
	   
	}
	@Then("user pick the first six jeans")
	public void user_pick_the_first_jeans() 
	
	{
		
		object.FirstSixJeans();
	
			 
	}
		
		
	
	
	
	
	@And("user print the name , disconted price and actual price of all the six jeans on console")
	public void user_print_the_name_disconted_price_and_actual_price_of_all_the_six_jeans_on_console()
	
	{    
		object.PrintNameActualPriceDiscountedPrice();
		
		
	}    
	
	@Then("user print the highest price from all the  prices")
	public void user_print_the_highest_price_from_all_the_prices() 
	
	
	{
		object.FindHighestPrice();
		
		
		}
	
	@Then("user close the browser")
	public void user_close_the_browser() 
	{
	   object.CloseTheBrowser();
	}

	    
	}


	

