Feature: Search and Place the order for Products

  Scenario: Search Experience for product seach in both home and offer page
    Given User is on GreenCart Landing Page
    When user searched with ShortName "Tom" and extract actual name of product
    Then user searched for  "Tom" ShortName in offers page
    And Validate product name in offers page matches with Landing Page
