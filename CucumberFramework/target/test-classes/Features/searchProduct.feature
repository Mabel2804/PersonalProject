Feature: Search and Place the order for products

@SearchOrders
Scenario Outline: Search Experience for product search in both Home and Offers Page
Given User is on the Greenkart Landing Page
When User searched with short name <Name> and extracted actual name of the product
Then User searched for <Name> short name in Offers page to check if product exists
And Validate if Product Name on Landing Page and Offers Page are same

Examples:
| Name  |
| Tom   |