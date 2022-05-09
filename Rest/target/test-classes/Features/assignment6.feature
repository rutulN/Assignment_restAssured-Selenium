Feature: Validate FutureDate
Scenario: Foreign Exchange FutureDate
Given API for foreign exchange two
When posted with future date information
Then validate positive response code received from futuredate