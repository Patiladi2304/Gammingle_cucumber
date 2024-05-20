
Feature: Marketing Category
 

  Scenario: create a Marketing Category
   Given user launch chrome browser
    When user open URL "http://skyonliners.com/demo/gammingle-web/webadmin"
    And user enter Email as "admin@admin.com" and Password as "Admin@2017"
    And click on login button
    Then user can view Dashboard
    When click on Master 
    And click on the Marketing category 
    And click on the add Marketing category 
    Then user can view add Marketing category page 
    When user enter Marketing name 
    And click on the Submit button 
    Then user can view Confirmation message "Data Added Successfully"
    And close the browser

  
