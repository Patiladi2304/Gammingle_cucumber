Feature: Contest

  Scenario: Add contest
    Given user launch chrome browser
    When user open URL "http://skyonliners.com/demo/gammingle-web/webadmin"
    And user enter Email as "admin@admin.com" and Password as "Admin@2017"
    And click on login button
    Then user can view Dashboard 
    When click on the DFS
    And click on the Contest
    And click on the Filter button
    And enter contest name
    Then user should found contest in table
    And close the browser
