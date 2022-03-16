Feature: Booking a Hotel in Adactin Application
Scenario Outline: Login
Given user Launch The Url
When user Enter The "<username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Examples:
|username|password|
|abc|123|
|xyz|5667|
|Ranjith|123|




