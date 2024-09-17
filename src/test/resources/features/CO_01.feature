Feature: Checkout Journey

  Scenario: TC_CO_01
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling first name field "Maulana"
    And The user filling last name field "Ilham"
    And The user filling postal code field 1234
    And The user click continue button
    And The user click finish button
    Then The success message should be displayed

  Scenario: TC_CO_02
    Given The user is login
    When The user click cart logo button
    And The user click checkout button
    Then The user still on the cart page

  Scenario: TC_CO_03
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling last name field "Ilham"
    And The user filling postal code field 1234
    And The user click continue button
    Then The warning message bellow first name field should be displayed

  Scenario: TC_CO_04
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling first name field "Maulana"
    And The user filling postal code field 1234
    And The user click continue button
    Then The warning message bellow last name field should be displayed

  Scenario: TC_CO_05
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling first name field "Maulana"
    And The user filling last name field "Ilham"
    And The user click continue button
    Then The warning message bellow postal code field should be displayed

  Scenario: TC_CO_06
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling first name field "Maulana"
    And The user filling last name field "Ilham"
    And The user filling invalid postal code field "aaa"
    And The user click continue button
    Then The user still on the checkout information page

  Scenario: TC_CO_07
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling first name field "Maulana"
    And The user click continue button
    Then The warning message should be displayed

  Scenario: TC_CO_08
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling last name field "Ilham"
    And The user click continue button
    Then The warning message should be displayed

  Scenario: TC_CO_09
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling postal code field 1234
    And The user click continue button
    Then The warning message should be displayed

  Scenario: TC_CO_10
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user click continue button
    Then The warning message should be displayed

  Scenario: TC_CO_11
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling first name field "Maulana"
    And The user filling last name field "Ilham"
    And The user filling postal code field 1234
    And The user click cancel button
    Then The user back to home page

  Scenario: TC_CO_12
    Given The user is login
    When The user click add to cart button
    And The user click cart logo button
    And The user click checkout button
    And The user filling first name field "Maulana"
    And The user filling last name field "Ilham"
    And The user filling postal code field 1234
    And The user click continue button
    And The user click cancel button on checkout overview page
    Then The user back to home page


