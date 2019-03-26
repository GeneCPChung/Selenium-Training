Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" Site
And Click on Login link in home page to land on sign in page

When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in
And close browsers

Examples:
|username			|password			|
|genecpc@gmail.com	|5zMR4g6zdxHb7yV	|