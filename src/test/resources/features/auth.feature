Feature: I as a user want to authenticate in the application to check my credentials


  @auth_incorrect
  Scenario: check login with incorrect username and password
    When I login in with the wrong username and password
    Then you should see the information toast


  @auth
  Scenario: check login with correct username and password
    When I login with username company and password company
    Then you should see the home page



