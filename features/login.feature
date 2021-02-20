Feature: Login Feature
Scenario:positive login scenario
Given user is on shop page5
When user clicks on shop menu5
When user clicks on home menu5
And Test home page has Only three arrivals
And Test page must have three arrivals
And click on any image in arrivals
And test that the page gets navigated where user adds any book to basket
And image shld be clickable and page shld navigate
And click on Review
Then shld get the Review

#Feature: Login Feature
#Scenario:positive login scenario
#Given user is on shop page3
#When user clicks on shop menu3
#When user clicks on home menu3
#And check home page has Only three arrivals
#And check page must have three arrivals
#And click on the image in arrivals
#And test that the page gets navigated where user adds book to basket
#And image shld clickable and page shld navigate
#And click on description
#Then shld get the  description


#Feature: Login Feature
#Scenario:positive login scenario
#Given user is on shop page2
#When user clicks on shop menu2
#When user clicks on home menu2
#When test home page has Only three arrivals
#And check page has three arrivals
#And click on the image 
#And test that the page gets navigated where user adds to basket
#Then image shld clickable and shld navigate


#Feature: Login Feature
#Scenario:positive login scenario
#Given user is on shop page
#When user clicks on shop menu
#When user clicks on home menu
#And test home page has three arrivals
#Then check page has only three arrivals


#Scenario: positive login scenario
#Given user is on login page
#When user enters "renumuthu11@gmail.com" & "sai baba"
#And user clicks on submit btn
#Then user is on home page


#Scenario Outline: Negative login scenario
#Given user is on login page
#When user enters "<username>" & "<password>"
#And user clicks on submit btn
#Then user login failed
#Examples:
#|username|password|
#|renuga|2365|
#|priya|9658|

#Scenario: Negative login scenario
#Given user is on login page
#When user enters data
#|username|renuga|
#|mobileNumber|236585694|
#|company|capgemini|
#And user clicks on submit btn
#Then user login failed





