package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UberbookingSteps {
	
	@Given("User wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
		System.out.println("Step 1 : " + carType);
	}

	@When("User selects car {string} and pickup point {string}  and drop location {string}")
	public void user_selects_car_and_pickup_point_and_drop_location(String carType, String pickUpLocation, String dropDownlocation) {
		System.out.println("Step 2 : " + carType + " " + pickUpLocation +" " + dropDownlocation);
	}

	@Then("Driver starts the journery")
	public void driver_starts_the_journery() {
		System.out.println("Step 3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5 : " + price);
	}

}
