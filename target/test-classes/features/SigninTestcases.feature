Feature: sign in testcases

Scenario: Testcase001 SignIn with vaid credentials
Given Open browser Navigate to "http://www.automationpractice.com"
When Click on the SignIn link
When Enter Username and Password "cwazymystie69@gmail.com" "696969"
Then Veirfy MyAccount Page displayed or not

Scenario: Testcase002 SignIn invaid credentials of wrong password
Given Open browser Navigate to "http://www.automationpractice.com"
When Click on the SignIn link
When Enter Username and Password "cwazymystie69@gmail.com" "147852"
Then Veirfy MyAccount Page displayed or not

Scenario: Testcase003 SignIn invaid credentials of wrong username
Given Open browser Navigate to "http://www.automationpractice.com"
When Click on the SignIn link
When Enter Username and Password "cwazymystie9@gmail.com" "696969"
Then Veirfy MyAccount Page displayed or not
