package starter.StepDef.Inoutbounds;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Inoutbounds.PutInoutboundsAPI;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;

public class PutInoutboundsStepDef {
    @Steps
    PutInoutboundsAPI putInoutboundsAPI;

    @Given("Update inoutbounds with id {string}")
    public void updateInoutboundsWithId(String jsonFile) {
        File json = new File(Constants.REQ_BODY+ jsonFile);
        PutInoutboundsAPI.setPutUpdateInoutbounds(json);
    }
    @When("Send request put inoutbounds")
    public void sendRequestPutInoutbounds() {
        SerenityRest.when().put(PutInoutboundsAPI.PUT_UPDATE_INOUTBOUNDS);
    }

    @And("Validate put create JSON schema {string}")
    public void validatePutCreateJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @When("Send request put invalid inoutbounds")
    public void sendRequestPutInvalidInoutbounds() {
        SerenityRest.put(PutInoutboundsAPI.PUT_UPDATE_INOUTBOUNDS_INVALID);
    }

    @Given("Update inoutbounds invalid with id {string}")
    public void updateInoutboundsInvalidWithId(String jsonFile) {
        File json = new File(Constants.REQ_BODY+ jsonFile);
        PutInoutboundsAPI.setPutUpdateInoutbounds(json);
    }

    @Then("Status code should be {int} NotFound")
    public void statusCodeShouldBeNotFound(int notfoun) {
        SerenityRest.then().statusCode(notfoun);
    }


//    @When("Send request put inoutbounds {string}")
//    public void sendRequestPutInoutbounds() {
//        SerenityRest.when().put(PutInoutboundsAPI.PUT_UPDATE_INOUTBOUNDS);
//    }
}
