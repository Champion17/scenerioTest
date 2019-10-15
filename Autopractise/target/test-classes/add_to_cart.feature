Feature: Adding a product to add to cart and remove

  Scenario: Adding a product to add to cart

  @add_to_cart
  Scenario: Add to cart

    Given user navigates to Automation practise page
    Then user should be on the Automation practise home page
    When user clicks on the dresses link
    Then user should be on the dresses page
    When user clicksd the printed dress button
    Then user should be on the printed dress page
    When user clicks on the add to cart button
    Then user should see the pop up window messaage Product successfully added to your shopping cart
    When user clicks on the clicks on the proceed tpo check out button
    Then user should be on the shopping to cart summary page
    When user clicks on the trash button
    Then user should see the your shopping cart is empty message