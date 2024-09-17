Feature: Add To Cart

  Scenario: TC_ATC_01
    Given The user is on the login page and login
    When The user click add to cart for all product
    And The user click cart button
    Then The amount chart should be displayed

  Scenario: TC_ATC_02
    Given The user is on the login page and login
    When The user click add to cart for all product
    And The user click remove for all product
    And The user click cart button
    Then The product shouldnt be displayed

  Scenario: TC_ATC_03
    Given The user is on the login page and login
    When The user click the product
    And The user click add to cart on the items page
    And The user click cart button
    Then The product should be exist

  Scenario: TC_ATC_04
    Given The user is on the login page and login
    When The user click the product
    And The user click add to cart on the items page
    And The user click remove on the items page
    And The user click cart button
    Then The product shouldnt be exist

  Scenario: TC_ATC_05
    Given The user is on the login page and login
    When The user click change display items
    And The user click add to cart for all product on the change view
    And The user click cart button
    Then The amount chart should be displayed

  Scenario: TC_ATC_06
    Given The user is on the login page and login
    When The user click change display items
    And The user click add to cart for all product on the change view
    And The user click remove for all product on the change view
    And The user click cart button
    Then The product shouldnt be displayed

  Scenario: TC_ATC_07
    Given The user is on the login page and login
    When The user click add to cart
    And The user click cart button
    And The user click remove on the cart page
    Then The product shouldnt be exist

  Scenario: TC_ATC_08
    Given The user is on the login page and login
    When The user click add to cart
    And The user click cart button
    And The user swipe left on the product
    And The user click delete button
    Then The product shouldnt be exist

  Scenario: TC_ATC_09
    Given The user is on the login page and login
    When The user click add to cart
    And The user click cart button
    And The user click continue shopping
    And The user click add to cart
    And The user click cart button
    Then The product should be displayed
