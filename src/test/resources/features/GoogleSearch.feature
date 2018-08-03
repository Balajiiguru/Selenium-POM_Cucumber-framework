Feature: To search cucumber in google

    @Regression
   Scenario Outline: Google Search
     Given I navigate to Google page
     When I perform search using Keyword "<Animal>"
     And I clicked the 3rd top level search results
     Then I should be navigated to clicked link corresponding webpage
     
    Examples:
    
   |Animal|
   |Elephant|
   |Cat|
   |Dog|    
    
     
