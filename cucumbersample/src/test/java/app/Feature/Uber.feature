Feature: Uber Booking Feature

Scenario: Booking Cab
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pickup point "Bangalore"  and drop location "Pune"
Then Driver starts the journery
And Driver ends the journey
Then User pays 1000 USD