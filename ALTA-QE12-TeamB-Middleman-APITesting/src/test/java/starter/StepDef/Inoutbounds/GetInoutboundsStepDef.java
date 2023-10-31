package starter.StepDef.Inoutbounds;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.DummyJsonResponses;
import starter.middleman.Inoutbounds.GetInoutboundsAPI;

import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GetInoutboundsStepDef {
    @Steps
    GetInoutboundsAPI getInoutboundsAPI;
    @Given("Get list User Stock Products")
    public void getListUserStockProducts() {
        getInoutboundsAPI.setGetInoutboundsAdmin();
    }

    @When("Send request get list inbounds admin")
    public void sendRequestGetListInboundsAdmin() {
        SerenityRest.when().get(GetInoutboundsAPI.GET_INOUTBOUNDS_ADMIN);
    }

    @And("Response body page should be {int}")
    public void responseBodyPageShouldBe(int page) {
        SerenityRest.then().body(DummyJsonResponses.DATA_ID_ARRAY,equalTo(page));
    }

    @And("Validate get list inbound user JSON schema {string}")
    public void validateGetListInboundUserJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get list User Inoutbounds Invalid")
    public void getListUserInoutboundsInvalid() {
        getInoutboundsAPI.setGetInoutboundsInvalidAdmin();
    }

    @When("Send request get list inbounds invalid admin")
    public void sendRequestGetListInboundsInvalidAdmin() {
        SerenityRest.when().get(GetInoutboundsAPI.GET_INOUTBOUNDS_ADMIN_UNSUCCESS);
    }
}
