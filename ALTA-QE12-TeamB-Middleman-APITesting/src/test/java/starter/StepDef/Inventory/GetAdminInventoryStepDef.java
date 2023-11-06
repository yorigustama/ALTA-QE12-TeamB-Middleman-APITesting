package starter.StepDef.Inventory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.MiddlemanResponses;
import starter.middleman.Inventory.GetAdminInventoryAPI;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GetAdminInventoryStepDef {

    @Steps
    GetAdminInventoryAPI getAdminInventoryAPI;
    @Given("Get list inventory admin")
    public void getListInventoryAdmin() {
        getAdminInventoryAPI.setGetAdminInventory();
    }

    @When("Send request get list inventory admin")
    public void sendRequestGetListInventoryAdmin() {
        SerenityRest.when().get(GetAdminInventoryAPI.GET_ADMIN_INVENTORY);
    }

    @And("Response body page should be {int}")
    public void responseBodyPageShouldBe(int page) {
        SerenityRest.then().body(MiddlemanResponses.DATA_ID_ARRAY,equalTo(page));
    }

    @And("Validate get list user JSON schema {string}")
    public void validateGetListUserJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
