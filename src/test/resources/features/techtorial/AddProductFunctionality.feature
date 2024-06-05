Feature: Testing Adding Product Functionality in Techtorial Website

  Scenario: Happy Path Product Addition Functionality
    Given User provides username and password to the Sign In box
    When User clicks Product Button on the left side and AddProductButton from ProductPage
    And User provides 'Truck-Mounted Crane' and '15000' to the product details box
    And User selects 'Lifting and Material Handling Equipment','Mobile Cranes' and '1' from drop-downs
    And User clicks purchase check box and add 'It is a good product' into the description.
    Then User validates product details 'Truck-Mounted Crane','$16,500.00','Allowed' from table

