package starter.stepdef.carts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.carts.GetCartsAPI;
import starter.utils.Constants;

import java.io.File;

public class GetCartsStepDef {

    @Steps
    GetCartsAPI getCartsAPI;

    @Given("Get carts with id {int}")
    public void getCartsWithId(int id) {
        getCartsAPI.setGetCartsUser(id);
    }

    @When("Send get carts request")
    public void sendGetCartsRequest() {
        SerenityRest.when().get(GetCartsAPI.GET_CARTS_USER);
    }

    @And("Validate get carts json schema")
    public void validateGetCartsJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA+"/GetCarts.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    //Scenario 2
    @Given("Get carts with invalid id {int}")
    public void getCartsWithInvalidId(int id) {
        getCartsAPI.setGetCartsUserNotFound(id);
    }

    @When("Send get carts request not found request")
    public void sendGetCartsRequestNotFoundRequest() {
        SerenityRest.when().get(GetCartsAPI.GET_CARTS_USER);
    }

    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }
}
