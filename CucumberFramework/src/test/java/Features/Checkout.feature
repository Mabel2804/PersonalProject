Feature: Place the order for products

@PlaceOrders
Scenario Outline: Search Experience for product search in Home Page
Given User is on the Greenkart Landing Page
When User searched with short name <Name> and extracted actual name of the product
And Added "3" items of the selected product to cart
Then User proceeds to checkout page and validate the <Name> items in checkout page
And Verify user has the ability to enter promo code and place the order

Examples:
| Name  |
| Tom   |
