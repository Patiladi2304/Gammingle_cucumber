Feature: Logout scenario 

  Scenario: Logout 
    Given user launch chrome browser
    When user open LoginURL
    And user enter Email as "admin@admin.com" and Password as "Admin@2017"
    And click on login button
    Then page title should be "Admin"
    When click on user Logout link
    Then page title should be "Login"
    And close the browser 