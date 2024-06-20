Feature: Contest

  Scenario: Add contest
    Given user launch chrome browser
    When user open URL "http://skyonliners.com/demo/gammingle-web/webadmin"
    And user enter Email as "admin@admin.com" and Password as "Admin@2017"
    And click on login button
    Then user can view Dashboard 
    When click on the DFS
    And click on the Contest
    And Click on the Add contest
    Then user can view add contest page
    When user Enter Contest  details
    And click on the sumbit button
    Then user can view Confirmation message "Data Added Successfully"
    And close the browser
