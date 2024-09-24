Feature: 	Enquiries

  Scenario: Click on the Enquiries
    Given user launch chrome browser
    When user open URL "http://skyonliners.com/demo/gammingle-web/webadmin"
    And user enter Email as "admin@admin.com" and Password as "Admin@2017"
    And click on login button
    Then page title should be "Admin"
    When click on the Enquiries
    Then enquiry page is display 
    
    
    
