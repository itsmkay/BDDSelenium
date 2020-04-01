Feature: KohlsSuits

Scenario: AddToCart
Given user launches the kohls website
When user enters the query and presses enter
Then user is taken to the results page
Then user sorts the results by price
Then user select the first item
Then user is taken to the product page
Then user selects the size
Then user clicks on Add to Cart button
Then item is added to the cart