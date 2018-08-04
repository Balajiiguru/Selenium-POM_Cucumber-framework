Feature: Google search

    @Regression
   Scenario Outline: Google Search and select the 3rd result link
     Given I navigate to Google page
     When I perform search using Keyword "<Animal>"
     And I clicked the 3rd top level search results
     Then I should be navigated to clicked link corresponding webpage
     
    Examples:
    
   |Animal|
   |Elephant|
   |Cat|
   |Dog|    
    
     
