Feature: search the clothes

Scenario: Testcase004 Search T-shirts and verify it
Given Open browser Navigate to "http://www.automationpractice.com"
When click on the search box and type "T-shirts"
When click on the button
Then verify the thirts page is opened or not

Scenario: Testcase005 Search dresses abd verify it with T-shirts
Given Open browser Navigate to "http://www.automationpractice.com"
When click on the search box and type "dresses"
When click on the button
Then verify the thirts page is opened or not