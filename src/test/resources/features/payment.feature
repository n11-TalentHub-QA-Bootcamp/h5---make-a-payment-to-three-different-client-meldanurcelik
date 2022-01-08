Feature: Payment I make a payment to three different client

  @payment_client
  Scenario Outline: I make a payment to three different client
    When I login with the correct username and password
    Then I should see the home page and go to payment page
    Then Pay with "<phone>", "<name>", "<amount>" and "<country>"
    Examples:
      | phone       | name   | amount | country |
      | 05555555555 | melda  | 10     | USA     |
      | 04444444444 | mert   | 20     | Canada  |
      | 06666666666 | handan | 30     | Japan   |



