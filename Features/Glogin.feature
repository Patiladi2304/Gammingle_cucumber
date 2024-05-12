Feature: Login with valid credentails

  Scenario: Title of your scenario
    Given user launch chrome browser
    When user open URL "http://skyonliners.com/demo/gammingle-web/webadmin"
    And user enter Email as "admin@admin.com" and Password as "Admin@2017"
    And click on login button
    Then page title should be "Admin"
    When click on user Logout link
    Then page title should be "Login"
    And close the browser 
   
    
  Scenario Outline: Login Data Driven 
    Given user launch chrome browser
    When user open URL "http://skyonliners.com/demo/gammingle-web/webadmin"
    And user enter Email as "<email>" and Password as "<password>"
    And click on login button
    Then page title should be "Admin"
    When click on user Logout link
    Then page title should be "Login"
    And close the browser
    
    Examples:
    | email | password |
    | admin@admin.com | Admin@2017 |
    | admin@admin.com | Admin@2014 |
    
    
   
	    
