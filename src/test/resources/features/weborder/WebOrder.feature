Feature: Testing Product Order Functionality

  Scenario: Happy path Order functionality
    Given User provides username,password and click order button
    When User enters the product information 'MyMoney' and '4'
    And User enters the address information 'Ahmet','2400 devos','Des Plaines','IL','60153'
    And User enters the payment information 'Visa','21312312321','11/25' and click process button
    Then User validates 'New order has been successfully added.'
    And User validates all the information 'Ahmet','MyMoney','4','2400 devos','Des Plaines','IL','60153','Visa','21312312321','11/25'

     #Homework
  #Complete last step with Arrays.asList
  #Create Runner and report
  #Do it with Scenario Outline after all