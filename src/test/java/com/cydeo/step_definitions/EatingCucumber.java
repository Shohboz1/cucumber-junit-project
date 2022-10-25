package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {

        @Given("Shokh is hungary")
        public void amin_is_hungary() {
            System.out.println("it is running from Given");
        }
        @When("Shokh is eating cucumber")
        public void amin_is_eating_cucumber() {
            System.out.println("it is running from When");
        }
        @Then("he is full")
        public void he_is_full() {
            System.out.println("it is running from Then");
        }
}
