Feature: Application Login

  Background: 
  
   
 		When launch the browser from config variables
  	And hit the home page url of the banking site


  @Regression @NetBanking
  Scenario: User Page defauly login
    Given User is on NetBanking landing page
    When User login into application with user and password 0953
    Then Home Page is displayed
    And Cards are displayed

  @SmokeTest @Regression @Mortgage
  Scenario Outline:  Mortgage User Page defauly login
    Given User is on NetBanking landing page
    When User login into application with "<UserName>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | UserName   | Password |
      | debituser  | hello1   |
      | stockuser  | hello2   |
      | credituser | hello3   |

  @SmokeTest
  Scenario: User Page default Sign up
    Given User is on Practice landing page
    When User SingUp into application
      | rahul             |
      | shetty            |
      | contact@email.com |
      |         123456789 |
    Then Home Page is displayed
    And Cards are displayed
