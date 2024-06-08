Feature: Testing Product Order Functionality

  Scenario: Happy path Order functionality
    Given User provides username,password and click order button
    When User enters the product information 'My Money' and '4'
    And User enters the address information 'Ahmet','2400 devos','Des Plaines','IL','60153'
    And User enters the payment information 'Visa','21312312321','11/25' and click process button
    Then User validates 'New order has been successfully added.'
    And User validates all the information 'Ahmet','My Money','4','2400 devos','Des Plaines','IL','60153','Visa','21312312321','11/25'
