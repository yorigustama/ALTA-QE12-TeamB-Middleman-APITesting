package starter.StepDef.Inventory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.DummyJsonResponses;
import starter.middleman.Inventory.PostAdminInventoryAPI;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class PostInventoryAdminStepDef {

    @Steps
    PostAdminInventoryAPI postAdminInventoryAPI;
    @Given("Add inventory admin with json {string}")
    public void addInventoryAdminWithJson(String jsonFile) {
        File json = new File(Constants.REQ_BODY + jsonFile);
        postAdminInventoryAPI.setPostInventoryAdmin(json);
    }

    @When("Send request post inventory admin")
    public void sendRequestPostInventoryAdmin() {
        SerenityRest.post(PostAdminInventoryAPI.POST_INVENTORY_ADMIN);
    }

    @And("Response body patch qty was {string} and unit was {string}")
    public void responseBodyPatchQtyWasAndLastNameWas(String qty, String unit) {
        SerenityRest.and().body(DummyJsonResponses.QTY, equalTo(qty));
        SerenityRest.and().body(DummyJsonResponses.UNIT, equalTo(unit));
    }

    @And("Validate post create JSON schema {string}")
    public void validatePostCreateJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
