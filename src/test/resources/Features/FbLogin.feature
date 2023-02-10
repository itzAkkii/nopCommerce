Feature: Login

Scenario: login to app

Given User opens Chrome browser
When User on log in page "https://admin-demo.nopcommerce.com/login"
And User enters username "admin@yourstore.com" and Password "admin"
Then User click on login button
Then close browser