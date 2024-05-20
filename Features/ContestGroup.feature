Feature: Contest Group

  Scenario: Title Add contest Group
    Given user launch chrome browser
    When user open URL "http://skyonliners.com/demo/gammingle-web/webadmin"
    And user enter Email as "admin@admin.com" and Password as "Admin@2017"
    And click on login button
    Then user can view Dashboard
    When click on the DFS
    And click on the Contest Group
    And Click on the Add contest group
    Then user can view add contest group page
    When user Enter Contest group details
    Then user can view Confirmation message "Data Added Successfully"
    And close the browser
   
  
    
