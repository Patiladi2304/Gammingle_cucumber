Feature: Login

  Scenario: Login With Valid crendtials
    Given user launch chrome browser
    When user open the url "https://admin-demo.nopcommerce.com/login"
    And user enters emails as "admin@yourstore.com" and password as "admin"
    And click on the Login button
    Then page title should be "Dashboard / nopCommerce administration"
    When click on the customer menu 
    And click on the Customers menu item 
    And  click on the Add new button 
    Then user can view Add new customer page 
    When user enter customer info 
    And click on the save button 
    Then user can view confirmation message "The new Customer has been added successfully".
    And close the browser