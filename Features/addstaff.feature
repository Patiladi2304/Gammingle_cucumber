Feature: manage staff
Scenario: Add new staff
    Given user launch chrome browser
    When user open URL "http://skyonliners.com/demo/gammingle-web/webadmin"
    And user enter Email as "admin@admin.com" and Password as "Admin@2017"
    And click on login button
    Then user can view Dashboard 
    When click on the staff
    And  click on the manage staff
     And  click on the add staff
      Then user can view add staff page
    And  user fill all the details
    And click on the Sumbit button
    Then user can view confirmation message "Data Added Successfully"
    And close the browser
