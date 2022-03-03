
Feature: Search for the Jeans 
  
Scenario: Verify that user is able to search for the first six jeans 
    
Given user is on the ajio home page
And user enter the jeans into the search bar
And user click on the search button
Then user pick the first six jeans
And user print the name , disconted price and actual price of all the six jeans on console
Then user print the highest price from all the  prices
Then user close the browser
