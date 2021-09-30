Feature: A user should be able to buy a mobile phone on Amazon website

  @pizza
  Scenario: Buy Mobile Phone

    Given a user is on the landing page of Amazon
    When he clicks on Mobiles
    And he hovers over Mobiles & Accessories on next page
    And he clicks on Apple in the submenu
    And he clicks on first available phone on the next page
    And he clicks on Buy Now button on new tab
    Then he must be able to purchase a new phone
