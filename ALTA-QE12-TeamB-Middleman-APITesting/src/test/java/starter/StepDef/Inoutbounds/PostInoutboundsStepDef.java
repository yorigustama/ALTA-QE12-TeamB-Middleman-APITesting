package starter.StepDef.Inoutbounds;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.DummyJsonResponses;
import starter.middleman.Inoutbounds.PostInoutboundsAPI;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class PostInoutboundsStepDef {
    @Steps
    PostInoutboundsAPI postInoutboundsAPI;
    @Given("Add inoutbounds with json {string}")
    public void addInoutboundsWithJson(String jsonFile) {
        File json = new File(Constants.REQ_BODY + jsonFile);
        postInoutboundsAPI.setPostCreateInbounds(json);
    }

    @When("Send request post inoutbounds")
    public void sendRequestPostInoutbounds() {
        SerenityRest.post(PostInoutboundsAPI.POST_CREATE_INBOUNDS);
    }

    @Then("Status code should be {int} ")
    public void statusCodeShouldBe(int OK) {
        SerenityRest.then().statusCode(OK);
    }
    @And("Response body product was {string} and qty was {string}")
    public void responseBodyProductWasAndQtyWas(String qty, String unit) {
        SerenityRest.and().body(DummyJsonResponses.QTY, equalTo(qty));
        SerenityRest.and().body(DummyJsonResponses.PRODUCT_ID, equalTo(unit));
    }

    @And("Validate post create JSON schema {string}")
    public void validatePostCreateJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

}
