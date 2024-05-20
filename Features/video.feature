Feature: Video

  Scenario: Upload video Url
    Given user launch chrome browser
    When user open URL "http://skyonliners.com/demo/gammingle-web/webadmin"
    And user enter Email as "admin@admin.com" and Password as "Admin@2017"
    And click on login button
    Then user can view Dashboard
    When click on Master
    And click on videos
    And click on the add video
    Then user can view add video page
    When user Enter Video information and upload url
    And click on the Submit button
    Then user can view confirmation message "Data Added Successfully"
    And close the browser
