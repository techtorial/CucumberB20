Feature: Testing Adding Product Functionality in Techtorial Website

  Background: Repetitive Step
    Given User provides username and password to the Sign In box

  Scenario: Happy Path Product Addition Functionality
    When User clicks Product Button on the left side and AddProductButton from ProductPage
    And User provides 'Truck-Mounted Crane' and '15000' to the product details box
    And User selects 'Lifting and Material Handling Equipment','Mobile Cranes' and '1' from drop-downs
    And User clicks purchase check box and add 'It is a good product' into the description.
    Then User validates product details 'Truck-Mounted Crane','$16,500.00','Allowed' from table

    Scenario: Happy Path Product Filter Functionality
      When User clicks Products button
      And User selects 'Lifting and Material Handling Equipment' and 'Mobile Cranes' for categories
      And User clicks three dots and view button for Product Page
      Then User validates 'Lifting and Material Handling Equipment' and 'Mobile Cranes' from action view