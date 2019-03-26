Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" Site
And Click on Login link in home page to land on sign in page

When User enters "genecpc@gmail.com" and "5zMR4g6zdxHb7yV" and logs in
Then Verify that user is succesfully logged in